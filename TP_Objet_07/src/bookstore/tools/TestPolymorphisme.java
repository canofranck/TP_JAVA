package bookstore.tools;

import bookstore.metier.Auteur;
import bookstore.metier.Personne;
import bookstore.metier.Utilisateur;

public class TestPolymorphisme {

    public static void main(String[] args) {
        Personne personne1 = new Auteur("l unique", "incroyable");
        Personne personne2 = new Utilisateur("utilisateur 2", "lagaffe", 9874521);
        Personne personne3 = new Personne("personne 3", "tagada");

        System.out.println(personne1.parle());
        System.out.println(personne2.parle());
        System.out.println(personne3.parle());

        //en mettant  abstract dans la classe Personne elle ne peut plus etre instancier 
        // Il faut passer par une classe qui définie les méthodes (la classe ne sera donc plus abstraite)
        //  on peut ainsi  l'instancier par une autre classe
       

    }
}
