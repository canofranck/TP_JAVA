import java.util.Arrays;
public class Item_2
{
	public static void main(String[] args) 
	{
	        String[] tab1 = {"eaux","kans","jura","judo","fuir","fume","gold","golf","base","boum"};
	        System.out.println("tab1 de base : ");
		     System.out.println(Arrays.toString(tab1) + "\n");
			 // copie par reference du tab1 dans tab2
		     String[] tab2 = tab1;   
		     System.out.println("tab2 copie de tab1 : ");
		     System.out.println(Arrays.toString(tab2) + "\n");
		     // ajout de +10 a chaque case du tab1
		        madifcaractere(tab1);
		        System.out.println("affichage des 2 tab apres du premier caractere");
		        System.out.println("tab1 = " + Arrays.toString(tab1));
		        System.out.println("tab2 = " + Arrays.toString(tab2) + "\n"); 
		        triertab(tab1);
		     // copie par clonage de tab1 dans tab2
		        System.out.println("copie par clonage");
		        String[] tab11 = {"eaux","kans","jura","judo","fuir","fume","gold","golf","base","boum"};
		        String[] tab22 = tab11.clone();   
		        System.out.println("tab1 de base : ");
		        System.out.println(Arrays.toString(tab11) + "\n");
		        System.out.println("tab2 copie de tab1 : ");
		        System.out.println(Arrays.toString(tab22) + "\n");
		     // ajout de +10 a chaque case du tab1
		        madifcaractere(tab11);
		        System.out.println("affichage des 2 tab apres changement du premier caractere ");
		        System.out.println("tab1 = " + Arrays.toString(tab11));
		        System.out.println("tab2 = " + Arrays.toString(tab22) + "\n");
		        triertab(tab11);
		     // copie case par case de tab 1 dans tab 2
		        System.out.println("copie case par case");
		        String[] tab111 = {"eaux","kans","jura","judo","fuir","fume","gold","golf","base","boum"};
		        String[] tab222 = new String[10];
		        System.arraycopy(tab111, 0, tab222, 0, tab111.length);
		        System.out.println("tab1 de base : ");
		        System.out.println(Arrays.toString(tab111) + "\n");
		        System.out.println("tab2 copie de tab1 : ");
		        System.out.println(Arrays.toString(tab222) + "\n");
		     // ajout de +10 a chaque case du tab1
		        madifcaractere(tab111);
		        System.out.println("affichage des 2 tab apres du premier caractere");
		        System.out.println("tab1 = " + Arrays.toString(tab111));
		        System.out.println("tab2 = " + Arrays.toString(tab222) + "\n");
		        triertab(tab111);


			
		 }

	     private static void madifcaractere(String[] tab1)
	     { 
	     	// Modification du premier caractere a chaque case du tab1
	     	for (int i = 0 ; i < tab1.length ; i++)
	     		{
	     		 StringBuilder stringBuilder = new StringBuilder(tab1[i]);
	             stringBuilder.setCharAt(0, '*');
	             tab1[i] = stringBuilder.toString();

	     		}
	     }
	     static void triertab(String[] tab)
	     {
	         Arrays.sort(tab);
	         System.out.println("tab 1 triée : " + Arrays.toString(tab)+"\n");
	     }


	        
	}

