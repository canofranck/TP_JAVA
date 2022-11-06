import java.util.Scanner;
public class Item4 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Entrer une url de type protcole://serveur/fichier : ");
		String url=sc.nextLine();
	
		while (true)
		{
            if ((!checkurl(url)))
            {
                System.out.println("protocole incorrect");
                break;
            }
            if ((!checkserveur(url)))
            {
                System.out.println("Erreur : pas de serveur et/ou pas de fichier");
                break;
            }
            break;
            
           
        }

	}
	static boolean checkserveur(String url)
	{
        String[] urlok = url.split("://");
        String[] serveurok = urlok[1].split("/");

        if (serveurok.length == 2){
            System.out.println("Serveur : " + serveurok[0]);
            System.out.println("Fichier : " + serveurok[1]);
            return true;
        }
		return false;
	}
	static boolean checkurl(String url) 
	{
		String[] urlok = url.split("://");
        if (urlok.length == 2)
        {
            System.out.println("Protocole : " + urlok[0]);
            return true;
        }
        return false;
	}
	 static boolean continu()
	    {
	    	System.out.println();
	        System.out.println("Voulez-vous continuer? (O/N)");
	        return sc.nextLine().equalsIgnoreCase("O");
	    }
}
