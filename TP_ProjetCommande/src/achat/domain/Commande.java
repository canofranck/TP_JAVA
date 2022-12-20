//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Commande.java

package achat.domain;

import java.util.ArrayList;
import java.util.Date;

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
   /**
    * @roseuid 63807C790238
    */
   
   public boolean addArticle(Article qte) {
		return lignescommandes.add(qte);
	}

/**
 * @param noCommande
 * @param adresseLivraison
 * @param dateCommande
 * @param qte
 * @param article
 */
public Commande(int noCommande, String adresseLivraison, String dateCommande, int qte) {
	
	this.noCommande = noCommande;
	this.adresseLivraison = adresseLivraison;
	this.dateCommande = dateCommande;
	this.qte = qte;
	
}





/**
 * @return the lignescommandes
 */
public ArrayList<Article> getLignescommandes() {
	return lignescommandes;
}





/**
 * @param lignescommandes the lignescommandes to set
 */
public void setLignescommandes(ArrayList<Article> lignescommandes) {
	this.lignescommandes = lignescommandes;
}





/**
 * @return the noCommande
 */
public int getNoCommande() {
	return noCommande;
}

/**
 * @param noCommande the noCommande to set
 */
public void setNoCommande(int noCommande) {
	this.noCommande = noCommande;
}

/**
 * @return the adresseLivraison
 */
public String getAdresseLivraison() {
	return adresseLivraison;
}

/**
 * @param adresseLivraison the adresseLivraison to set
 */
public void setAdresseLivraison(String adresseLivraison) {
	this.adresseLivraison = adresseLivraison;
}

/**
 * @return the dateCommande
 */
public String getDateCommande() {
	return dateCommande;
}

/**
 * @param dateCommande the dateCommande to set
 */
public void setDateCommande(String dateCommande) {
	this.dateCommande = dateCommande;
}

/**
 * @param qte the qte to set
 */
public void setQte(int qte) {
	this.qte = qte;
}

public Article getArticle() {
	return article;
}

public void setArticle(Article article) {
	this.article = article;

}

public int getQte() {
	return qte;
}

public void setQte(Integer qte) {
	this.qte = qte;
}
// 2 Avec getPrix()
public Double getPrix() 
{
	return this.getArticle().getPrixUnitaire()*qte;
}
@Override
public String toString() {
	return "Commande [article=" + article + "]";
}

   
}
