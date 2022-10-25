
public class Item_4
{
	public static void main(String[] args) 
	{
		boolean nbpremier=true;
		int i,k;
		System.out.printf("Nombres premiers de 2 a 100 :\n");
		for( i=2;i<=100;) 
		{
			nbpremier=true;
			for(k=2;k<=i;k++)
			{
				if((i%k) == 0 && k!= i)
				{
				nbpremier=false;
				}

			}
			if (nbpremier)
			{
				System.out.printf("%d  ",i);
			i++;
			}
			else i++;
			
			
			
		}
	}

}	

