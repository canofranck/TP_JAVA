package bookstore.metier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utilisateur
{
	private final String nom;
	private final String prenom;
	private final int idUtilisateur;
    private Livre livreEmprunte;
    private LocalDateTime dateEmprunt;
    private final static int dureeMaxPret = 15;
    private final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Utilisateur( String nom, String prenom,int idUtilisateur, Livre livreEmprunte, LocalDateTime dateEmprunt)
    {
    	this.nom = nom;
        this.prenom = prenom;
        this.idUtilisateur = idUtilisateur;
        this.livreEmprunte = livreEmprunte;
        this.dateEmprunt = dateEmprunt;
    }
    public Utilisateur( String nom, String prenom,int idUtilisateur)
    {   
    	this(nom, prenom,idUtilisateur, null,null);
    }
    public void emprunterLivre(Livre livre, LocalDateTime dateEmprunt){
        if (livre.isDisponible())
        {
            this.livreEmprunte = livre;
            this.dateEmprunt = dateEmprunt;
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
        this.livreEmprunte = null;
        this.dateEmprunt = null;
        System.out.println("Le livre " + livre.getTitre() + " a bien été rendu");
    }

    public boolean isPretEnRetard(){
        return this.dateEmprunt.plusDays(dureeMaxPret+1).isBefore(LocalDateTime.now());
    }
}

