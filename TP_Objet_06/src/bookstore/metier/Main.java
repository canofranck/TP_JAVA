package bookstore.metier;

import static bookstore.metier.Livre.compare2; /// tpobjet_02  item 3 on doit importer la methode static de classe

public class Main {

	public static void main(String[] args) {
		Livre livre1 = new Livre("celebre auteur", "le monde perdu", 2, 20, null);
		Livre livre2 = new Livre("Dorison Xavier", "Goldorak", 2, 30, null);

		Personne personne1 = new Personne("personne 1", "tagada");
		Personne personne2 = new Personne("personne 2", "trucbidule");
		System.out.println(personne1.parle());
		System.out.println(personne2.parle());
		Utilisateur util1 = new Utilisateur("utilisateur 1", "mon prenom", 1233640);
		Utilisateur util2 = new Utilisateur("utilisateur 2", "lagaffe", 9874521);
		System.out.println(util1.parle());
		System.out.println(util2.parle());
		Auteur auteur1= new Auteur("auteur1","le meileuur");
		Auteur auteur2= new Auteur("auteur1","bien meilleur que auteur 1 et de loin");
		System.out.println(auteur1.parle());
		System.out.println(auteur2.parle());
		
	}
}