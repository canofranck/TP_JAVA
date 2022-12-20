//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\Personne.java

package achat.domain;

import java.util.Date;

public class Personne 
{
   private String nom;
   private String prenom;
   private String dateNaiss;
   
   /**
    * @roseuid 63807C790059
    */
   
   
   public Personne() 
   {
    
   }

/**
 * @param nom
 * @param prenom
 * @param dateNaiss
 */
public Personne(String nom, String prenom, String dateNaiss) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.dateNaiss = dateNaiss;
}
   
   /**
    * @return TypeAge
    * @roseuid 6380784402C9
    */
 //  public  int getAge() 
 //  {
 //   return ;
 //  }
}
