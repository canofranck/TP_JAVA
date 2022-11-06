import java.util.Scanner;
public class exercice08
{
		static Scanner scanner = new Scanner(System.in);
	    /** Nombre de COLONNES_MAX
	     *  8 dans ce cas
	     */
	    static final int COLONNES_MAX = 8; /** nombre de colonne pour l affichage des resultat */
	    
	    /** Nombre de LIGNES_MAX
	     *  10 ici
	     */
	    static final int LIGNES_MAX = 10;  /** nombre de lignes avant une pagination */
	    
	    static int nb;  /** variable pour le chiffes dont on veut afficher les multiples */
	    static int bInf;  /** variable pour le chiffre de depart */
	    static int bSup;  /** variable pour le chiffre de fin */
	    static int x;     /** variable pour la boucle d affichage */

	  
	    public static void main(String[] args) 
	    {

	        while (true)
	        {
	            nb = demanderNombre();
	            bInf = demanderBorneInf();
	            bSup = demanderBorneSup();

	            System.out.println("afficher resultats");
	            visualize();

	            if (!oneMoreTime())
	            {
	                break;
	            }

	        }
	    }

	 
	   
	    /**	Methode demanderNombre  permet de demander a l utilisateur de entrée le chiffre dont on cherche les doubles
	     * @return nombre
	     */
	    static int demanderNombre()
	    {
	        System.out.println("Tapez un nombre pour trouver son multiple : ");

	        while (true)
	        {
	            int nombre = scanner.nextInt();
	            if (nombre <= 0)
	            {
	                scanner.nextLine();
	                System.out.println("Le nombre doit être positif. Tapez un autre nombre");
	            } else
	            {
	                return nombre;
	            }
	        }
	    }

	    /** Methode demanderBorneInf   demande à l utilisateur a partir de quel nombre il veut effecteur la recherche
	     * @return la valeur de la borne inférieure
	     */
	    static int demanderBorneInf()
	    {
	        System.out.println("Tapez la borne inférieure : ");
	        return scanner.nextInt();
	    }

	    /**Methode demanderBorneSup   demande à l utilisateur jusqu a quel  nombre il veut effecteur la recherche
	     * @return la valeur de la borne superrieur
	     */
	    static int demanderBorneSup()
	    {
	        System.out.println("Tapez la borne supérieure ");
	        int nombre = scanner.nextInt();

	        while (true)
	        {
	            if (nombre <= bInf)
	            {
	                scanner.nextLine();
	                System.out.println("Le nombre doit être supérieur à la borne inférieure ( >" + bInf + ")");
	                continue;
	            }
	            return nombre;
	        }
	    }



	    /** Methode pour demander à l utilisateur si il veut continuer O/N
	     * @return true
	     */
	    static boolean oneMoreTime()
	    {
	    	System.out.println();
	        System.out.println("Voulez-vous continuer? (O/N)");
	        return scanner.nextLine().equalsIgnoreCase("O");
	    }


	    /** Methode visualise
	     *  affiche sous forme de ligne et colonne le resulat 
	     */
	    static public void visualize()
	    {
	        x = bInf;
	        while (x <= bSup )
	        {
	            if (x % nb == 0)
	                System.out.print("\t(" + x++ + ")");
	            else
	                System.out.print("\t " + x++);
	            if ((x - bInf) % COLONNES_MAX == 0) System.out.println();
	            if ((x - bInf) % (COLONNES_MAX * LIGNES_MAX) == 0)
	            {
	                System.out.println("\nAppuyer sur ENTREE ...");
	                scanner.nextLine();

	            }
	        }
	    }
}
