
public class Item1 
{
	public static void main(String[] args)
	{
		for (short i=0; i<40000;i++)  // short	est un Entier sur	2 octet	 avec comme valeur max -32768 à 32767 Donc la boucle est infini car i n atteint jamais 40000
		{
			System.out.println(i);
			
		}
	}
}