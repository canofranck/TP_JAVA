package bookstore.test;
//import org.junit.jupiter.api.Test;
import static bookstore.metier.Livre.compare2;

import bookstore.metier.*;
public class TestLivre
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
	
	// item 6
	Livre livre3 = new Livre("test de livre item 6","super auteur",300,30);
	Livre livre4 = new Livre("test2 de livre item 6","super auteur");
	Livre livre5=  new Livre(300);

	System.out.println(livre3);
	System.out.println(livre4);
	System.out.println(livre5);
	}
}
