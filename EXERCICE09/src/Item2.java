import java.util.Scanner;
public class Item2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		String texte="L'élève";
		String  texte2;
		System.out.printf("Pour la chaine : L'élève la chaine unicode est : ");
		char[] texteCharac=texte.toCharArray();
		for(char c:texteCharac) {
			System.out.printf("\\u%04x ",(int)c);
		}
		 System.out.println();
		 System.out.printf("Entrer un texte : ");
		 texte2=sc.nextLine();
		 System.out.printf("Pour la chaine : "+texte2+ " la chaine unicode est : ");
		 char[] texte2Charac=texte2.toCharArray();
			for(char c:texte2Charac) {
				System.out.printf("\\u%04x ",(int)c);
			}
	}

}
