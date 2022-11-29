package bookstore.metier;

public class Auteur extends Personne{

    @Override
    public String parle() {
        return "je suis un auteur qui aime s ecouter parlerrrrrrrrrrrrrr";
    }

    public Auteur(String nom, String prenom) {
        super(nom, prenom);
    }
}
