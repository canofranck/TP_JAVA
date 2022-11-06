import java.util.Scanner;
public class Item1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		String  texte,texte2;
		 while (true)
		 {	 
			 System.out.println();
			 System.out.println("Pour sortir du programe taper FIN");
			 System.out.printf("Entrer un texte : ");
			 texte=sc.nextLine();
			 System.out.println();
			 System.out.println("Entrer un second texte : ");
			 texte2=sc.nextLine();
			 System.out.println();
			 if (texte.equals(texte2))
				 System.out.println("Les deux textes sont IDENTIQUE ");
			 else  System.out.println("Les deux textes sont DIFFERENT ");
			 if (texte.equalsIgnoreCase("fin")||texte2.equalsIgnoreCase("fin")) 
			 {	
				 System.out.println();
				 System.out.println("Fin du programme ");
	                break;
	            }
		 }

	}

}
