//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Commande.java

package achat.domain;
import java.util.ArrayList;

/**
 * ON CONCEPTUALISE LA COMMANDE DU CLIENT
 */
public class Commande
{
   private int noCommande;
   private String adresseLivraison;
   private String dateCommande;
   private int qte;
   
   private Article article;//association 1_1
   private ArrayList<Article> lignescommandes = new ArrayList<>();
   private ArrayList<LigneCommande> lignesCommandes = new ArrayList<>();
	
	public boolean addLigneCommande(LigneCommande ligneCde) {
		return lignesCommandes.add(ligneCde);
	}

	//GETTER 
	public int getNoCommande() {
		return noCommande;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public String getDateCommande() {
		return dateCommande;
	}

	public ArrayList<LigneCommande> getLignesCommandes() {
		return lignesCommandes;
	}

	// SETTER

	public void setNoCommande(int noCommande) {
		this.noCommande = noCommande;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public void setLigneCommande(ArrayList<LigneCommande> lignesCommandes) {
		this.lignesCommandes = lignesCommandes;
	}

	
	
	// Constructeur
	
	public Commande () {
		
	}
	
	public Commande(int noCommande, String adresseLivraison, String dateCommande) {
		super();
		this.noCommande = noCommande;
		this.adresseLivraison = adresseLivraison;
		this.dateCommande = dateCommande;
		
	}
	
	// Methode
	
	public double getPrix () {
		double cumul = 0.;
		for (LigneCommande ligneCommande : lignesCommandes) {
			cumul += ligneCommande.getPrix();
			
			
		}
		
		return cumul;
	}
	
	
	
}
