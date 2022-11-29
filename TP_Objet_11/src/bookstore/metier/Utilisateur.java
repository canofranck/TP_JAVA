package bookstore.metier;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur extends Personne implements Nommable
{
	static int NOMBRE_MAX_PRET = 3;
	private final int idUtilisateur;
    private Livre livreEmprunte;
    private LocalDate dateEmprunt;
    private final static int dureeMaxPret = 15;
    private final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private List<Livre> livresEmprunte;

    public Utilisateur( String nom, String prenom,int idUtilisateur, Livre livreEmprunte, LocalDate dateEmprunt)
    {
    	 super(nom, prenom);
        this.idUtilisateur = idUtilisateur;
        this.livreEmprunte = livreEmprunte;
        this.livresEmprunte = new ArrayList<>();
    }
    
    public Utilisateur( String nom, String prenom,int idUtilisateur)
    {   
    	this(nom, prenom,idUtilisateur, null,null);
    }
    public void emprunterLivre(Livre livre, LocalDate dateEmprunt){
        if (livre.isDisponible())
        {
        	addLivre(livre);
            livre.setDateEmprunt(dateEmprunt);
            System.out.println("Le livre " + livre.getTitre() + " a bien été emprunté.");
            livre.setDisponible(false);
           
            return;
        }
        System.out.println("Le livre " + livre.getTitre() + " n'est pas disponible pour le moment ");
    }

    public void rendreLivre(Livre livre){
        if (!this.livreEmprunte.equals(livre)){
            System.out.println("Erreur : Impossible de rendre un livre non possédé");
            return;
        }
        livre.setDisponible(true);
        removeLivre(livre);
        livre.setDateEmprunt(null);
      
        System.out.println("Le livre " + livre.getTitre() + " a bien été rendu");
    }

    public boolean isPretEnRetard(){
        return livreEmprunte.getDateEmprunt().plusDays(dureeMaxPret+1).isBefore(LocalDate.now());
    }
    @Override
    public String parle() {
        return "je suis un utilisateur passioné par ce programme";
    }
    @Override
    public String toString() {
        if (livresEmprunte.size() == 0) {
            return getPrenom() + " n'a pas de livre emprunté";
        }
        StringBuilder result = new StringBuilder("Utilisateur" + getPrenom() + " a le(s) livre suivant.s : ");

        for (Livre livre : livresEmprunte) {
            result.append(livre.getTitre()).append("\n");
        }

        return result.toString();
    }

    public void clearLivre() {
        for (Livre livre : livresEmprunte) {
            livre.setDisponible(true);
            livre.setDateEmprunt(null);
        }
        livresEmprunte.clear();
        System.out.println(getPrenom() + " a rendu tous les livres d'un coup");
    }

    public Livre findLivreByTitre(String titre) {
        for (Livre livre : livresEmprunte) {
            if (livre.getTitre().equals(titre)) return livre;
        }
        return null;
    }

    public List<Livre> findAllLivres() {
        return livresEmprunte;
    }

    public void setLivresEmprunte(List<Livre> livresEmprunte) {
        this.livresEmprunte = livresEmprunte;
    }
   

    public boolean containsLivre(Livre livre) {
        return livresEmprunte.contains(livre);
    }
    private void addLivre(Livre livre)  {
        if (livresEmprunte.size() < NOMBRE_MAX_PRET) {
            this.livresEmprunte.add(livre);
            livre.setDisponible(false);
            return;
        }
        else 
        	 {System.out.println("Vous avez atteint le nombre maximal de prêt qui est de " + NOMBRE_MAX_PRET);
        		return;}	
    }

    private void removeLivre(Livre livre) {
        this.livresEmprunte.remove(livre);
        livre.setDisponible(true);
    }
    public int getNbRetards() {
        int nbRetard = 0;
        for (Livre livre : livresEmprunte) {
            if (isPretEnRetard()) nbRetard++;
        }
        return nbRetard;
    }
    public boolean isConditionsPretAcceptees() {
        return livresEmprunte.size() < NOMBRE_MAX_PRET && getNbRetards() == 0;
    }
}

