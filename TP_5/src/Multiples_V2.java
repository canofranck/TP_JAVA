import java.util.Scanner;
public class Multiples_V2 
{
	
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
    	
    	int nbDiv=0 ;
    	int nbmax=0;
 
    
    	while (true)
    	{
    		System.out.println("entrer le chiffre dont vous voulez trouver les doubles  : ");
            nbDiv = sc.nextInt(); // variable pour le chiffre dont on veut les doubles
            System.out.println("Jusqu a quel valeur max voulez vous chercher les doubles ?: ");
            nbmax = sc.nextInt(); // variable pour savoir jusqu a quel nombre max on veut les doubles
    		System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 0 et "+nbmax+"\n");
    		sc.nextLine();
    		int nbcaractere=0;
    		for (int x = 0; x <= nbmax; x++) // boucle permettant d afficher les multiples de nbdiv jusqu a nbmax
    		{   
    			if (nbcaractere==20)  // boucle permettant un affichage de 20 nombre par ligne
    			{ 
    				  System.out.print("\n");
    	                nbcaractere = 0;
    	           
    			}
    			if (x % nbDiv == 0) // condition pour savoir si le reste de la division par nbdiv est egale à 0 
    			{
    			System.out.print("(" + x + ")\t"); // si le reste=0 on affiche le multiple entre ()
    				
    			}
    			else
    			{
    			System.out.print(" "+x + "\t"); // sinon on affiche simplement le chiffre suivant 
    			}
    			nbcaractere++; // incrementation de la variable comptant le nombre de caratere par ligne
    		}
    		System.out.println();
    		
    		System.out.println("\n\u001B[0mVoulez-vous trouver d'autres multiples? (o/n)");
    		  if (!check())
    		  	{
                  break;
    		  	}
    	} 
    
    
    }
    		 
    static private boolean check()
    {
        String rep;
        while (true)
        {
            rep = sc.nextLine().toUpperCase();
            if (rep.equals("O") || rep.equals("N"))
            {
                break;
            }
            System.out.println("Merci d'entrer \"o\" (oui) ou \"n\" (non)");
        }
        return rep.equals("O");
    }	

   }

	



