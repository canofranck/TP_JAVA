
public class Item4 {

	public static void main(String[] args)
	{
		double num = 456789.789013456789;
		int num_int = (int) num;
		short num_short = (short) num;
		float num_float = (float) num;
		long num_long = (long) num;
		byte num_byte = (byte) num;
        char num_char = (char) num;
        
        System.out.println("valeur du double : " + num);  				 // affiche la valeur precise
        System.out.println("valeur du int : " + num_int);				// affiche la valeur entiere donc sans la precision de la virgule				
        System.out.println("valeur du short : " + num_short);			// affiche une valeur fausse car il ne peut contenir un chiffre aussi grand et a donc "boucler " sur sa tranche de valeur min et max
        System.out.println("valeur du float : " + num_float);			// affiche une valeur precise à 2 chiffres apres la virgule
        System.out.println("valeur du long : " + num_long);				// affiche la valeur sans precision a virgule 
        System.out.println("valeur du byte : " + num_byte);      		// affiche une valeur fausse comme pour le cas de short
        System.out.println("valeur du char : " + num_char);				// affiche un caractere donc sans aucun sens
 
	}

}
