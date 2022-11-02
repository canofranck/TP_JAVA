
public class ASCII 
{
   
    public static void main(String[] args)
    {
    	// affiche chr , hexadecimal et decimal en haut du tableau sur 4 colone 
    	System.out.print("chr" + "\t hexadecimal " +  "\t decimal" +  "\t"+"chr" + "\t hexadecimal " +  "\t decimal" +  "\t"+"chr" + "\t hexadecimal " +  "\t decimal" +  "\t"+"chr" + "\t hexadecimal " +  "\t decimal" +  "\t");
    	System.out.println();
    	int nb = 0;
        int decimal;
                for ( decimal = 33; decimal <= 126; decimal++)  // boucle pour afficher les caracteres utilisable en identificateur en Java
                {
                	nb++;
                	if (nb ==4) // permet d afficher 4 colonnes
                	{
                		System.out.println("");
                		nb = 0;
                	}
                	char caracter = (char) decimal;
                	System.out.print("'" + caracter + "'\t\t" + Integer.toHexString(decimal) + "\t    " + decimal + "\t\t");
                }
    }
}
