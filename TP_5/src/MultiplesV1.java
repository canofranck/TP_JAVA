
public class MultiplesV1 
{


    

    public static void main(String[] args)
    
    {
    	int nbDiv = 7; // valeur dont on veut les multiples
        System.out.println("\nAffichage des MULTIPLES de " + nbDiv + " entre 0 et 100\n");

        for (int x = 0; x <= 100; x++)  // boucle permettant d afficher les multiples de 7 jusqu a 100
        {

            if (x % nbDiv == 0) // condition pour savoir si le reste de la division par 7 est egale à 0 
            {
                System.out.print("(" + x + ")\t"); // si le reste=0 on affiche le multiple entre ()
            } else 
            {
                System.out.print(x + "\t"); // sinon on affiche simplement le chiffre suivant 
            }
        }
    } 
}