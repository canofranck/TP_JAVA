package bookstore.test;
//import org.junit.jupiter.api.Test;
import static bookstore.metier.Livre.*;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalDateTime;

import bookstore.metier.*;
public class TestLivre
{

	public static void main(String[] args)
	{
	
	//LocalDateTime dateAchat = LocalDateTime.now();
		LocalDateTime dateAchat = LocalDateTime.now();
	Livre livre1= new Livre("uderzo","Asterix au pays du Java ",2,20,dateAchat);
	Livre livre2= new Livre("Hergé","Tintin  direction le Java",200,30,dateAchat);
	System.out.println();
	Utilisateur toto = new Utilisateur( "tata", "Toto",123456);
	Utilisateur zorro = new Utilisateur("est arriver sans se presser", "Zorro",654321);
	
	toto.emprunterLivre(livre1, dateAchat);
	zorro.emprunterLivre(livre2, dateAchat);
	System.out.println("TOTO a emprunter le livre :"+ livre1+" le "+dateAchat);
	System.out.println("ZORRO a emprunter le livre :"+ livre2+" le "+dateAchat);
	System.out.println("TOTO est il en retard ?");
	livreEnRetard(toto);
	
	toto.rendreLivre(livre1);
	zorro.emprunterLivre(livre1, dateAchat);
	
	
	}
}
