package bookstore.metier;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Utilisateur extends Personne implements Nommable
{

	private final int idUtilisateur;
    private Livre livreEmprunte;
    private LocalDate dateEmprunt;
    private final static int dureeMaxPret = 15;
    private final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Utilisateur( String nom, String prenom,int idUtilisateur, Livre livreEmprunte, LocalDate dateEmprunt)
    {
    	 super(nom, prenom);
        this.idUtilisateur = idUtilisateur;
        this.livreEmprunte = livreEmprunte;
        this.dateEmprunt = dateEmprunt;
    }
    public Utilisateur( String nom, String prenom,int idUtilisateur)
    {   
    	this(nom, prenom,idUtilisateur, null,null);
    }
    public void emprunterLivre(Livre livre, LocalDate dateEmprunt){
        if (livre.isDisponible())
        {
            this.livreEmprunte = livre;
            livre.setDateEmprunt(dateEmprunt);
            System.out.println("Le livre " + livre.getTitre() + " a bien été emprunté.");
            livre.setDisponible(false);
            livre.setEmprunteur(this);
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
        this.livreEmprunte = null;
        livre.setDateEmprunt(null);
        livre.setEmprunteur(null);
        System.out.println("Le livre " + livre.getTitre() + " a bien été rendu");
    }

    public boolean isPretEnRetard(){
        return livreEmprunte.getDateEmprunt().plusDays(dureeMaxPret+1).isBefore(LocalDate.now());
    }
    @Override
    public String parle() {
        return "je suis un utilisateur passioné par ce programme";
    }
}

