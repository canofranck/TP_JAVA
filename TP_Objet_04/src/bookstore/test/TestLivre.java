package bookstore.test;
//import org.junit.jupiter.api.Test;
import static bookstore.metier.Livre.*;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.ObjDoubleConsumer;

import javax.management.Descriptor;

import bookstore.metier.*;
public class TestLivre
{

	public static void main(String[] args)
	{
	
	//LocalDateTime dateAchat = LocalDateTime.now();
		LocalDateTime dateAchat = LocalDateTime.now();
	Livre livre1= new Livre("uderzo","Asterix au pays du Java ",2,20,dateAchat);
	Livre livre2= new Livre("Hergé","Tintin  direction le Java",400,30,dateAchat);
	Livre livre3= new Livre("auteur","direction la lune",50,5,dateAchat);
	Livre livre4= new Livre("inconnu","mes memoires",200,30,dateAchat);
	Utilisateur toto = new Utilisateur( "tata", "Toto",123456);
	Utilisateur zorro = new Utilisateur("est arriver sans se presser", "Zorro",654321);
	
	
     LivreComparator comparaisonLivre = new LivreComparator();
     
     // item 2
     
     List<Livre> listeDesLivres = new ArrayList<>();
	 listeDesLivres.add(livre1);
     listeDesLivres.add(livre2);
     listeDesLivres.add(livre3);
     listeDesLivres.add(livre4);
     listeDesLivres.sort(comparaisonLivre);
     for (Livre livre : listeDesLivres) {
         System.out.println(livre.getTitre() + " a " + livre.getNbPages() + " pages");
     }
     
     // le tri est un tri ascendant 
     
     // item 3 ordre descendant 
     
     System.out.println();
     System.out.println(" tri inversé");
     Collections.reverse(listeDesLivres);  // on utilise la fonction reverse de arraylist 
     for (Livre livre : listeDesLivres) {
         System.out.println(livre.getTitre() + " a " + livre.getNbPages() + " pages");
     }
     
     // item 4
     
     System.out.println();
     System.out.println("comparaison longueur des titres des livres ");
     LivreComparatorTitre comparaisonLivre2 = new LivreComparatorTitre();
     List<Livre> listeDesLivres2 = new ArrayList<>();
   	 	listeDesLivres2.add(livre1);
        listeDesLivres2.add(livre2);
        listeDesLivres2.add(livre3);
        listeDesLivres2.add(livre4);
        listeDesLivres2.sort(comparaisonLivre2);
        for (Livre livre : listeDesLivres2) {
            System.out.println(livre.getTitre() + " a " + livre.getNbPages() + " pages");
        }
     
     
	
	
	
	}
}
