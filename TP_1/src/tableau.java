import java.util.Date;
import java.util.Scanner;
//import java.util.*;
import static java.lang.System.out;
public class tableau
{
	 public static void main( String [] args )
	 {
	
	 
        int i;
		////////////////////////////////
		//  Saisie au Clavier
		System.out.print("Entrez la valeur max du tableau :");
		java.util.Scanner sc= new Scanner( System.in );
        int nombre = sc.nextInt();
		for( i=1;i<=nombre;i=i+1)
		{
			int carre = (int)Math.pow(i,2);
			float racine = (float)Math.sqrt(i);			
			System.out.println("pour : " + i + "   au carré : " + carre  + "  Racine carré" + racine );
	
		}
		


	 }
}
