import java.util.Scanner;
public class Item_3 
{
    public static void main(String[] args)
    {
    	double a,b,c,delta,solution1,solution2,solution3=0;
    	
    	Scanner scanner = new Scanner(System.in);
    	do 
    	{
    		System.out.println("Resolution d' equation du second degré ax²+bx+c=0  ");
    		System.out.println("Entrer la valeur de a :  ");
    		a = scanner.nextInt() ;
    		System.out.println("Entrer la valeur de b :  ");
        	b = scanner.nextInt() ;
        	System.out.println("Entrer la valeur de c :  ");
        	c = scanner.nextInt() ;
        	delta=a*a-(4*a*c);
        	if (delta<0)   // condition pour savoir si l equation à une solution ou pas , si ou on sort de la boucle
        		System.out.println("il n 'y a pas de solution à cette equation !!! ");
        	else 
        		break;
    	} 
    	while(delta<0);
    	
    	if(delta==0) // condition si delta=0 alors une solution on calcul et  on l affiche
    	{
			solution1=-b/(2*a);
			System.out.printf("Le resultat de l'equation est  : x=%f"+ solution1);
		}
		else {		// sinon l equation a 2 solution qu on calcul et affiche
			solution2=(-b-Math.sqrt(delta))/(2*a);
			solution3=(-b+Math.sqrt(delta))/(2*a);
			System.out.printf("Le resultat de l'equation est x1 = "+solution2+" et x2 = "+solution3);
		}	
      
  

    }
}
