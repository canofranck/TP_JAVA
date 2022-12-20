//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Client.java

package achat.domain;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class Client extends Personne {
	private int idClient;
	
	private ArrayList<Commande> commandes = new ArrayList<>(); // association 1_N

	public boolean addCommande(Commande cde) {
		return commandes.add(cde);
	}

	/**
	 * @roseuid 63807C7901A8
	 */
	public Client(String nom, String prenom, String dateNaissance, int idClient) {
		super(nom, prenom, dateNaissance);
		this.idClient = idClient;
	}

	// Methode avec chiffres d affaires
	
	/*
	 * public double getChiffreAffaire() { float cumul = 0; for (Commande commande :
	 * commandes) { cumul += (commande.getArticle().getPrixUnitaire() *
	 * commande.getQte()); }
	 * 
	 * return cumul; }
	 */
	// Methodes avec getprix
	
	public double getChiffreAffaire() {
		float cumul =0;
		for (Commande commande : this.getCommandes()) {
			cumul += commande.getPrix();
		}
		return cumul;
	}

	
	

	/**
	 * @return the commandes
	 */
	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	/**
	 * @param commandes the commandes to set
	 */
	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

	public static void main(String[] args) {
		Article clavierMidiArticle = new Article(412, "clavier midi 61 touches", 347, EnumStatusStock.PLEIN50);
		Article camionPompierArticle = new Article(189, "camion de pompier rouge", 27, EnumStatusStock.PLEIN50);
		Commande cdenoelCommande = new Commande(4, "chelles", "30/01/2022", 2);

		cdenoelCommande.setArticle(clavierMidiArticle);
		cdenoelCommande.setQte(2);

		Commande cdePaquesCommande = new Commande(7, "Paris", "15/04/2002", 1);
		cdePaquesCommande.setArticle(camionPompierArticle);
		cdePaquesCommande.setQte(1);
		cdePaquesCommande.setArticle(clavierMidiArticle);
		

		ClientParticulier totoClientParticulier = new ClientParticulier("LARIFLETTE", "toto", "13/05/2022", 721,"Champs");
		totoClientParticulier.addCommande(cdenoelCommande);
		totoClientParticulier.addCommande(cdePaquesCommande);

		System.err.println("Voici le chiffres d affaire de toto : " + totoClientParticulier.getChiffreAffaire());
		
		

	}
}