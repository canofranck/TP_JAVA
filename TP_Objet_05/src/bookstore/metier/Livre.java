package bookstore.metier;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Livre 
{


		// Variables
		private String titre,auteur;
		private int nbpages;
		private double prix;
		boolean prixFixe;
		private final static Comptable comptableCacherComptable = new Comptable();
		boolean disponible;
		private EnumStatusLivre enumStatusLivre;
		private TypeDonneeAnnee anneeParution;
		private LocalDateTime dateAchat;
		private static DateTimeFormatter dtf;
		//Constructeur
		
		  public Livre(String unAuteur, String unTitre,int nbPages,double unPrix,LocalDateTime dateAchat,TypeDonneeAnnee anneeParution) 
		  { 
		  auteur=unAuteur;
		  titre=unTitre;
		  nbpages=nbPages;
		  prix=unPrix;
		  comptableCacherComptable.Comptabilise(this);
		  this.disponible = true;
	      this.dateAchat = dateAchat;
	      this.anneeParution = anneeParution;
	      dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy à HH:mm:ss");
		  }
		  
		
		// Accesseur
		public String getAuteur()
		{
			return auteur;
		}
		public String getTitre()   // Item 2 accesseur de titre
		{
			return titre;
		}
		public int getNbPages()    // Item 2 accesseur de nbpages
		{
			return nbpages;
		}
		public boolean isPrixFixe()   // //  tpobjet_02 item 1.2
		{
	        return prixFixe;
	    }
	    public boolean isDisponible() {
	        return disponible;
	    }

	    public void setDisponible(boolean disponible) {
	        this.disponible = disponible;
	    }
	    
	
	
		
		/**
		 * @return the enumStatusLivre
		 */
		public EnumStatusLivre getEnumStatusLivre() {
			return enumStatusLivre;
		}
		/**
		 * @param enumStatusLivre the enumStatusLivre to set
		 */
		public void setEnumStatusLivre(EnumStatusLivre enumStatusLivre) {
			this.enumStatusLivre = enumStatusLivre;
		}
		
		
	

		/**
		 * @return the anneeParution
		 */
		public TypeDonneeAnnee getAnneeParution() {
			return anneeParution;
		}


		// Mutateur
		public void setnbPages(int nbPages)
		{
	        if (nbPages < 0)			// Item 2 controle du nb de pages
	        {
	            System.out.println("le Nombre de page  ne peut t être négatif , le changement de valeur est refusé");  // affichage du message d erreur 
	            return;					// si negatif retourne rien :-)
	        }
			this.nbpages=nbPages;
		}
		public void setAuteur(String auteur)  // Item 2 Mutateur de auteur
		{
			this.auteur=auteur;
		}
		public void setTitre(String titre)		  // Item 2 mutateur de titre
		{
			this.titre=titre;
		}
		
		 public void afficheToi(){			  // Item 4.1 Mehtode affiche toi
		   //     System.out.println(this.auteur+" "+this.titre+" "+this.nbpages); // ligne pour item 4.1
			 System.out.println(this);   // ligne pour item 4.5
		    }
		 @Override
		 		 public String toString() {         //  tpobjet_02 item 1.1
			 
			DecimalFormat prixFormat= new DecimalFormat("00.00€");
			if (this.prix<0 )
				return "Le livre " + titre + " de " + auteur + " a "+ nbpages + " pages" + "le prix est indeterminé";
			else 
				return "Le livre " + titre + " de " + auteur + " a "+ nbpages + " pages" + " au prix de : "+ prixFormat.format(this.prix)+ "   Disponibilité : " + this.enumStatusLivre + " date de parution : " +this.anneeParution;
		 }
		 
		 // tpobjet_02 item 1.1
			public double getPrix()
			{
				return prix;
			}

			public void setPrix(double prix)
			{
				
				  this.prix=prix;                  // tpobjet_02 item 1.2 pas besoin d une methode setprixfixe on peut changer la variable boolenne ici directement 
				
				  comptableCacherComptable.Comptabilise(this);
				
				
			}
			public int compare(Livre livre) 		// tpobjet_02 item 2 methode d instance compare
			{
		        return Integer.compare(this.nbpages - livre.nbpages, 0);
			}
			public static int compare2(Livre livre, Livre livre1)
			{
		        return Integer.compare(livre.nbpages - livre1.nbpages, 0);
		    }
			public static Object retourcomptable ()
			{
				return comptableCacherComptable.getTotalPrix();

			} 
			public static void livreEnRetard(Utilisateur utilisateur) {
		        if (utilisateur.isPretEnRetard()) {
		            System.out.println("le pret est en Retard");
		            return;
		        }
		        System.out.println("le pret n est pas en retard");
		    }

}
