package bookstore.metier;

public class TypeDonneeAnnee {
    private int annee;

    

	TypeDonneeAnnee(int annee) {
        this.annee = annee;
    }

    static public TypeDonneeAnnee donneeAnnee(int annee) {
        if (annee > 0) {
            return new TypeDonneeAnnee(annee);
        }
        throw new IllegalArgumentException("ERROR : L'année n'est pas un entier supérieur à 0");
    }
    /**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
		
	}

	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
}
