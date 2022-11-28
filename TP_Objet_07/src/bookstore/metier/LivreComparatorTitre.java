package bookstore.metier;

import java.util.Comparator;

public class LivreComparatorTitre implements Comparator<Livre>
{
	 @Override
	   public int compare(Livre livre1, Livre livre2) {
	        return livre1.getTitre().length() - livre2.getTitre().length();

}
}