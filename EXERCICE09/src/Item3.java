
import java.util.Scanner;
public class Item3
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
	String texte1;
	String texte2;
	
	System.out.println("de combien de decalage voulez vous coder  : ");
    int nbdecalage = sc.nextInt();
   
    sc.nextLine();
	System.out.println("Entrer le texte a coder : ");
	texte1=sc.nextLine();
	texte2=coder(texte1,nbdecalage);
	System.out.println("la chaine original est : " + texte1);
	System.out.println("la chaîne cryptée est  : " + texte2);
	texte1=decoder(texte2,nbdecalage);
	System.out.println("la chaîne decryptée est  : " + texte1);
	
	}
	private static String decoder(String texte2, int nbdecalage)
	{
		StringBuilder texte1 = new StringBuilder(texte2);
		String texte3 = null;
		for (int i = 0 ; i < texte1.length() ; i++)
		{
            int tab = texte1.charAt(i);
            if (tab >=97 && tab<= 122)
            {
                if (tab == 'a'){
                    texte1.setCharAt(i, 'z');
                } else
                		{
                		tab -= nbdecalage;
                		texte1.setCharAt(i, (char) tab);
                		}
            }
            texte3=texte1.toString();
        }

		return texte3;
	}
	private static String coder(String texte1, int nbdecalage)
	{
		
		StringBuilder texte2 = new StringBuilder(texte1);
		String texte3 = null;
		for (int i = 0 ; i < texte2.length() ; i++)
		{
            int tab = texte2.charAt(i);
            if (tab >=97 && tab<= 122)
            {
                if (tab == 'z'){
                    texte2.setCharAt(i, 'a');
                } else
                		{
                		
						tab += nbdecalage;
                		texte2.setCharAt(i, (char) tab);
                		}
            }
            texte3=texte2.toString();
		
		}
		return texte3;	
	}
	
}

