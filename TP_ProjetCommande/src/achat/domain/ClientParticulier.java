//Source file: E:\\22_ETUDE_CONCEPTOBJET_UMLDiagDeClasse__CUs__ROSE\\269_DEMO_22_2_Rose_PresentationDesDiagrammes_saufCU_LesCommandes\\java_brut_par_Rose\\achat\\domain\\ClientParticulier.java

package achat.domain;


/**
 * Abstraction du Client particulier
 */
public class ClientParticulier extends Client 
{
   private String adressePersonnelle;
   
   /**
    * @roseuid 63807C7900C0
    */
   public ClientParticulier(String nom, String prenom, String dateNaiss, int idClient,String adressePersonelle) 
   {
	   super(nom, prenom,dateNaiss,idClient);
	   this.adressePersonnelle = adressePersonelle;
   }
   
}
