package bookstore.test;

//import org.junit.jupiter.api.Test;
import static bookstore.metier.Livre.*;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;

import bookstore.metier.*;

public class TestLivre {

	public static void main(String[] args) {

		// LocalDateTime dateAchat = LocalDateTime.now();
		LocalDateTime dateAchat = LocalDateTime.now();
		Livre livre1 = new Livre("uderzo", "Asterix au pays du Java ", 2, 20, dateAchat);
		Livre livre2 = new Livre("Hergé", "Tintin  direction le Java", 200, 30, dateAchat);
		Livre livre3 = new Livre("livre3", "auteur3", 100, 15, dateAchat);
		Livre livre4 = new Livre("livre4", "auteur4", 100, 15, dateAchat);
		Livre livre5 = new Livre("livre5", "auteur5", 100, 15, dateAchat);
		Livre livre6 = new Livre("livre6", "auteur6", 100, 15, dateAchat);
		Livre livre7 = new Livre("livre7", "auteur7", 100, 15, dateAchat);

		System.out.println();
		Utilisateur toto = new Utilisateur("tata", "Toto", 123456);
		Utilisateur zorro = new Utilisateur("est arriver sans se presser", "Zorro", 654321);
		LocalDate dateEmprunt = LocalDate.of(2022, 11, 5);

		toto.emprunterLivre(livre1, dateEmprunt);
		zorro.emprunterLivre(livre2, dateEmprunt);
		toto.emprunterLivre(livre7, dateEmprunt);
		toto.emprunterLivre(livre6, dateEmprunt);
		toto.emprunterLivre(livre5, dateEmprunt);
		toto.emprunterLivre(livre4, dateEmprunt);

		
	
		zorro.emprunterLivre(livre1, dateEmprunt);
		toto.emprunterLivre(livre2, dateEmprunt);
		System.out.println("Toto a " + toto.getNbRetards() + " livre.s en retard");
		
		 zorro.emprunterLivre(livre3, LocalDate.now());
	        System.out.println(zorro);

	        System.out.println(zorro.findLivreByTitre("livre3"));

	}
}
