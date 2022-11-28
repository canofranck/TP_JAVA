package bookstore.test;

import bookstore.metier.Livre;
import  bookstore.metier.Comptable;



public class TestComptable 
{

	public static void main(String[] args)
	{
		
		Comptable comptable1 = new Comptable();
		Comptable comptable2 = new Comptable();
		Livre livre1= new Livre("celebre auteur","le monde perdu",2,20,null);
		Livre livre2= new Livre("Dorison Xavier","Goldorak",2,30,null);
		Livre livre3= new Livre("auteur mort ","titre fameux",200,10,null);
		Livre livre4= new Livre("auteur fou ","qu est ce que la folie ",999,5.50,null);
		comptable1.Comptabilise(livre1);
		comptable1.Comptabilise(livre2);
		comptable2.Comptabilise(livre3);
		comptable2.Comptabilise(livre4);
		System.out.println(livre1);
		System.out.println(livre2);
		System.out.println(livre3);
		System.out.println(livre4);
		System.out.println("Le comptable 1 a compter livre 1 et livre 2 , le total est de : "+comptable1.getTotalPrix());
		System.out.println("Le comptable 2 a compter livre 3 et livre 4 , le total est de : "+comptable2.getTotalPrix());
		// item 2
		Livre livre5= new Livre("auteur incroyable ","comment devenir bon  ",1,9.50,null);
		
		System.out.println("Le comptable cacher à compter tout les 5 livres le total est de : "+Livre.retourcomptable());
		// item 3
		livre1.setPrix(10);
		System.out.println("Le comptable cacher à compter tout les 5 livres le total est de : "+Livre.retourcomptable());
	}



}
