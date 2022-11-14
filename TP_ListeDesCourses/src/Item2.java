import java.util.LinkedList;
import java.util.Scanner;

public class Item2
{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		String enter;
		 
		 LinkedList<String> list =  new LinkedList<String>();  // avec linked list le fonctionnement du programme est identique //
		 while (true) {
			 			 
	            System.out.println("Pour entrer un nouvel article : n");
	            System.out.println("Pour sortir de l'application : q");
	            System.out.println();    
	            System.out.println(); 
	            System.out.println("Quel est  votre choix :");

	            enter = scanner.nextLine().toLowerCase();
	            if (enter.equals("n")) 
	            {
	            	System.out.println("Entrer l article que vous voulez ajouter : ");
	            	list.add(scanner.nextLine());
	            }
	            if (enter.equals("q")) {
	                break;
	            }
	            System.out.println(); 
	            System.out.println("         Contenu du panier");
	            System.out.println("         -----------------");
              
       for (String element : list) {
           System.out.println("- " + element);
       } 
	        }

	}
	
}
