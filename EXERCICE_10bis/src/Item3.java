import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.OptionalDouble;
public class Item3
{
	static Scanner sc=new Scanner(System.in);
	static public double moyenne;
	static public double note;
	static public double notemax,notemin,mediane;
	
	public static void main(String[] args)
	{
		
		
		 while (true)
	        {
			 double[] tabnote = new double[11];
			 System.out.println("Programme de gestions de notes sur 20 , avec calcul de la moyenne, note minimun maximun et la medianne");
			 System.out.println();
			 System.out.println("si moins de 10 notes tapez 99 pour afficher les resultat");
			 Saisirnotes(tabnote);
		 	 calculmoyenne(tabnote);
			 triernote(tabnote);
			 notemax(tabnote);
			 notemin(tabnote);
			 mediane(tabnote);
			 resultat(tabnote);
			 
			 if (!continu())
			 {
              break;
			 }
	        }
	}
	
	private static void resultat(double[] tabnote) 
	{
		System.out.println();
		 System.out.println(" la moyenne est de : "+moyenne );
		 System.out.println();
		 System.out.println(" la note max  est de :"+notemax);
		 System.out.println();
		 System.out.println(" la note min  est de :"+notemin);
		 System.out.println();
		 System.out.println(" la mediane   est de :"+mediane);
		 System.out.println();
		
		 for ( int j=1 ; j<=10;j++)
		 {
	 
		 System.out.println(" la note n°"+ j +" est de :"+tabnote[j]);	
		 }
	}

	private static void  mediane(double[] tabnote)
	{
		  int middle = tabnote.length/2;
		    if (tabnote.length%2 == 1) {
		        mediane=tabnote[middle];
		    } else {
		        mediane=(tabnote[middle-1] + tabnote[middle]) / 2.0;
		    }
		
	}

	private static void notemin(double[] tabnote)
	{
		notemin=21;
		 for ( int j=1 ; j<=10;j++)
		 {
		 if (tabnote[j]<notemin)
		 
			 notemin=tabnote[j];
		 }
		
	}

	private static void notemax(double[] tabnote)
	{
		 for ( int j=1 ; j<=10;j++)
		 {
		 if (notemax<tabnote[j])
		 {
			 notemax=tabnote[j];
		 }
			 	
		 }
		
	}
	private static void triernote(double[] tabnote)
	{
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=1;i<tabnote.length-1;i++) {
				if(tabnote[i]>tabnote[i+1]) {
					double temp=tabnote[i];
					tabnote[i]=tabnote[i+1];
					tabnote[i+1]=temp;
					flag=true;
				}
			}
		}
		
	}
	public static void Saisirnotes(double[] tabnote) 
	{
		int notenumero=1;
		
		do {
			 System.out.println("Entrer la note n°"+notenumero+" :  ");
			  note = sc.nextDouble();
			  if (note==99)
				  break;
			  
			  if (note>=00&&note<=20)
			  {
				 tabnote[notenumero]= note;
				 notenumero++;
				 
			  }
			  else 
				  System.out.println("ce n est pas une note valide "); 
			  
			} while(notenumero<=10);
		
	}
	public static void calculmoyenne(double[] tabnote)
	{
		double total = 0;
		for(int i=1; i <= 10; i++)
		   {
	          total = total + tabnote[i];
	        }
	        moyenne = total / tabnote.length;
	        
	        moyenne = (double) Math.round(moyenne * 100)/100;
					
	}
	 static boolean continu()
	    {
	    	System.out.println();
	    	sc.nextLine();
	        System.out.println("Voulez-vous continuer? (O/N)");
	        return sc.nextLine().equalsIgnoreCase("O");
	    }
}


