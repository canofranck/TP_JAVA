import java.util.Scanner;
import java.util.*;
public class main
{

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		 List<Integer> cl =  new ArrayList<>();
		 while (true) {
			  System.out.println("""
                      Contenu du panier
                      -----------------
              """);

      for (String element : contenuDuPanier) {
          System.out.println("- " + element);
      }
	            System.out.println("""

	                       Pour entrer un nouvel article : n
	                       Pour sortir de l'application : q
	                   
	                Donnez votre choix :""");

	            String actionUtilisateur = sc.nextLine().toLowerCase();
	            if (actionUtilisateur.equals("n")) {
	                panierVirtuel.ajouterNouvelArticle();
	            }
	            if (actionUtilisateur.equals("q")) {
	                break;
	            }
	        }

	}

}
