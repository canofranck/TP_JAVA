package bookstore.test;
import java.util.HashSet;

import bookstore.metier.Livre;
public class TestSetLivre 
{

	public static void main(String[] args) 
	{
		HashSet<Livre> hset = new HashSet<Livre>();
		Livre livre1= new Livre("celebre auteur","le monde perdu",100,20);
		Livre livre2= new Livre("Dorison Xavier","Goldorak",200,30);
		Livre livre3= new Livre("dodou","alphonse",200,30);
		hset.add(livre1);
		hset.add(livre2);
		hset.add(livre3);
		for(Livre valeur:hset)
		{ System.out.println(valeur); // item 2 si les livres ont le meme nombre de pages il est pas ajouter au HASHSET
			 }

		
	}

}
