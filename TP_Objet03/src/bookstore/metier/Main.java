package bookstore.metier;
import static bookstore.metier.Livre.compare2; /// tpobjet_02  item 3 on doit importer la methode static de classe
public class Main 
{

	public static void main(String[] args)
	{
		//Item 1
	Livre livre1= new Livre("celebre auteur","le monde perdu",2,20);
	
	Livre livre2= new Livre("Dorison Xavier","Goldorak",2,30);
	System.out.println("Item 1 :");
	System.out.println();
	System.out.println("L auteur du livre un est   : "+livre1.getAuteur());
	System.out.println("L auteur du livre deux est : "+livre2.getAuteur());
	System.out.println();
	
	// item 2
	System.out.println("Item 2 :");
	System.out.println();
	System.out.println("Le livre un a   "+livre1.getNbPages()+" pages");
	System.out.println("Le livre deux a "+livre2.getNbPages()+" pages");
	System.out.println("Le nombre de pages Total des 2 livres est de :"+(livre2.getNbPages()+livre1.getNbPages())+" pages");
	// item 4.1
	System.out.println("Item 4.1 :");
	System.out.println();
	livre1.afficheToi();
	//item 4.2
	System.out.println("Item 4.2 :");
	System.out.println();
	 System.out.println("item 4.2 affichage de l objet livre ce qui donne : "+livre1); 
	//item 4.3 et 4.4
	 System.out.println("Item 4.3 et 4.4:");
	 System.out.println();
	 System.out.println(livre1);
	 System.out.println(livre2);
	//item 4.5
		 System.out.println("Item 4.5 :");
		 System.out.println(livre1);
		 System.out.println(livre2);
		 
	// item 5
	// sans le constructeur on ne peut pas creer de nouveau livre
		 
	// test changement prix  tpobjet_02  item 1.2 	 
	livre1.setPrix(60);	 // le prix ayant ete fixé avant le prix ne change pas
	System.out.println(livre1);
	
	// tpobjet_02  item2 	
	Livre livre3= new Livre("auteur merveilleux","le genie",300,25);
	Livre livre4= new Livre("auteur mort ","la tombe ",100,5);
	System.out.println(livre3.compare(livre4)); // affiche 1 car livre 3 a plus de page que livre 4
	livre3.setnbPages(50);
	System.out.println(livre3.compare(livre4)); // affiche -1 car livre 3 a moins de page que livre 4
	livre4.setnbPages(50);
	System.out.println(livre3.compare(livre4)); // affiche 0 car livre 3 a le meme nombre  de page que livre 4
	System.out.println("L'auteur du plus grand livre est : ");
	livre3.setnbPages(150);
	String auteurPlusGrosLivreString;
	if (livre3.compare(livre4)==1)
	{
		auteurPlusGrosLivreString=livre3.getAuteur();
		System.out.println(	auteurPlusGrosLivreString);	
	}
	// tpobjet_02  item 3
	System.out.println(compare2(livre3, livre4));
	}

	

}
