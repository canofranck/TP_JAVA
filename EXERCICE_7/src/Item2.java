/**
 * 
 */
import java.util.Scanner;
/**
 * @author 
 *
 */
public class Item2 {

	/**
	 * @param args
	 */
	static Scanner sc=new Scanner(System.in);
	 
	public static void main(String[] args)
	{
		String  texte;
		 while (true)
		 {
			 System.out.printf("Entrer un texte en minuscule : ");
			 System.out.println();
			 System.out.println("Taper \"0\" pour sortir du programme");
			 texte=sc.nextLine();
			 char[] cs=texte.toCharArray();
			 for(char c:cs)
				 System.out.printf("%c",(c>='a'&&c<='z')?(char)(c-32):c);
			 System.out.printf("\n\n");
			 if (texte.equalsIgnoreCase("0")) 
			 {
	                break;
	            }
		 }
	
	
		


	}

}
