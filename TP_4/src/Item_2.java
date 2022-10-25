import java.util.Scanner;

public class Item_2 
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Entrez 2 chiffres l un apres l autre : ");
        double nb1 = scanner.nextDouble();
        double nb2 = scanner.nextDouble();
        scanner.nextLine();
        boolean test=true; // variable pour la boucle while
        String op="";
        while  (test=true)
        {
        System.out.println("Que voulez vous faire en choisissant ces operateur : + ou - ou * ou / ");
        String operateur = scanner.nextLine();
        if ( operateur.equals("+")||operateur.equals("-")||operateur.equals("*")||operateur.equals("/")) // condition pour tester si l entree corresponds au choix demander
        	if (nb2==0 && operateur.equals("/")) // condition pour savoir si c est une division par zero et si oui on redemande un choix        	
        		{
        		System.out.println("Division par zero impossible");

        		} 
        	else 
        		{
        	op=operateur;
        		break;	
        		}
        }	
        switch(op) // condition pour effectuer et afficher les calculs
        {
		case "+": System.out.printf("\n%.2f + %.2f = %.2f",nb1,nb2,nb1+nb2);break;
		case "-":System.out.printf("\n%.2f - %.2f = %.2f",nb1,nb2,nb1-nb2);break;
		case "*":System.out.printf("\n%.2f x %.2f = %.2f",nb1,nb2,nb1*nb2);break;
		case "/":System.out.printf("\n%.2f / %.2f = %.2f",nb1,nb2,nb1/nb2);break;
        
        }
			
    }   }
	
