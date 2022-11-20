package bookstore.metier;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Livre
{


		// Variables
		private String titre,auteur;
		private int nbpages;
		double prix;
		boolean prixFixe;
		private final static Comptable comptableCacherComptable = new Comptable();
		//Constructeur
		
		  public Livre(String unAuteur, String unTitre,int nbPages,double unPrix) 
		  { 
		  auteur=unAuteur;
		  titre=unTitre;
		  nbpages=nbPages;
		  prix=unPrix;
		 
		  comptableCacherComptable.Comptabilise(this);
		  }
		  public Livre (String auteur, String titre) // item 6 surcharge
		  {
			  this(titre, auteur, 0,0);   
		  }
		  public Livre (int nbPages ) 
		  {
			  this("vide","vide", nbPages,0); 
		  }   
		  public Livre()							// item 6
		  {
			  this("XXX", "XXX", 0,0);
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
				return "Le livre " + titre + " de " + auteur + " a "+ nbpages + " pages" + " au prix de : "+ prixFormat.format(this.prix);
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
		

}
