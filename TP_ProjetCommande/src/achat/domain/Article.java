//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Article.java

package achat.domain;


public class Article 
{
   private int noArticle;
   private String description;
   private double prixUnitaire;
   private EnumStatusStock etatStock;
   
   /**
    * @roseuid 63807C7901F4
    */

/**
 * @param noArticle
 * @param description
 * @param prixUnitaire
 * @param etatStock
 */
public Article(int noArticle, String description, double prixUnitaire, EnumStatusStock etatStock) {
	super();
	this.noArticle = noArticle;
	this.description = description;
	this.prixUnitaire = prixUnitaire;
	this.etatStock = etatStock;
}

public double getPrixUnitaire() {
	return prixUnitaire;
}

public void setPrixUnitaire(double prixUnitaire) {
	this.prixUnitaire = prixUnitaire;
}

@Override
public String toString() {
	return "Article [noArticle=" + noArticle + ", prixUnitaire=" + prixUnitaire + "]";
}
   

}
