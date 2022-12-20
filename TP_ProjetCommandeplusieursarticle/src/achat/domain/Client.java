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
		Article clavierMidiArticle = new Article(412, "clavier midi 61 touches", 100, EnumStatusStock.PLEIN50);
		Article camionPompierArticle = new Article(189, "camion de pompier rouge", 50, EnumStatusStock.PLEIN50);
		LigneCommande n1 = new LigneCommande(4, 978, clavierMidiArticle); // ajout des articles de commandes
		LigneCommande n2 = new LigneCommande(2, 30, camionPompierArticle);
		
		  System.out.println(" plusieurs article dans une commande"); 
		  ClientParticulier franck = new ClientParticulier("cano", "franck", "23/05/1971", 23,"meaux");
		  Commande cdeplusieursArticle = new Commande(10, "Meaux", "30/11/2022"); 
		  cdeplusieursArticle.addLigneCommande(n1); // ajout des lignes de commande à la commande
		  System.out.println(" la commande coute "+cdeplusieursArticle.getPrix()); 
		  cdeplusieursArticle.addLigneCommande(n2);
		  System.out.println(" la commande coute  "+cdeplusieursArticle.getPrix()); 
		  franck.addCommande(cdeplusieursArticle);
		
	  System.err.println("Voici le chiffres d affaire de franck: " + franck.getChiffreAffaire());
		
		 

	}
}