import java.util.Arrays;
public class item_1
{
	 public static void main(String[] args) 
	 {
		 int[] tab1 = {12,4,25,6,80,45,3,32,69,21};
	     System.out.println("tab1 de base : ");
	     System.out.println(Arrays.toString(tab1) + "\n");
		 // copie par reference du tab1 dans tab2
	     int[] tab2 = tab1;   
	     System.out.println("tab2 copie de tab1 : ");
	     System.out.println(Arrays.toString(tab2) + "\n");
	     // ajout de +10 a chaque case du tab1
	        add10(tab1);
	        System.out.println("affichage des 2 tab apres le +10");
	        System.out.println("tab1 = " + Arrays.toString(tab1));
	        System.out.println("tab2 = " + Arrays.toString(tab2) + "\n"); 
	        triertab(tab1);
	     // copie par clonage de tab1 dans tab2
	        System.out.println("copie par clonage");
	        int[] tab11 = {12,4,25,6,80,45,3,32,69,21};
	        int[] tab22 = tab11.clone();   
	        System.out.println("tab1 de base : ");
	        System.out.println(Arrays.toString(tab11) + "\n");
	        System.out.println("tab2 copie de tab1 : ");
	        System.out.println(Arrays.toString(tab22) + "\n");
	     // ajout de +10 a chaque case du tab1
	        add10(tab11);
	        System.out.println("affichage des 2 tab apres le +10");
	        System.out.println("tab1 = " + Arrays.toString(tab11));
	        System.out.println("tab2 = " + Arrays.toString(tab22) + "\n");
	        triertab(tab11);
	     // copie case par case de tab 1 dans tab 2
	        System.out.println("copie case par case");
	        int[] tab111 = {12,4,25,6,80,45,3,32,69,21};
	        int[] tab222 = new int[10];
	        System.arraycopy(tab111, 0, tab222, 0, tab111.length);
	        System.out.println("tab1 de base : ");
	        System.out.println(Arrays.toString(tab111) + "\n");
	        System.out.println("tab2 copie de tab1 : ");
	        System.out.println(Arrays.toString(tab222) + "\n");
	     // ajout de +10 a chaque case du tab1
	        add10(tab111);
	        System.out.println("affichage des 2 tab apres le +10");
	        System.out.println("tab1 = " + Arrays.toString(tab111));
	        System.out.println("tab2 = " + Arrays.toString(tab222) + "\n");
	        triertab(tab111);


		
	 }

     private static void add10(int[] tab1)
     { 
     	// ajout de +10 a chaque case du tab1
     	for (int i = 0 ; i < tab1.length ; i++)
     		{
     		tab1[i] = tab1[i] + 10;
     		}
     }
     static void triertab(int[] tab)
     {
         Arrays.sort(tab);
         System.out.println("tab 1 triée : " + Arrays.toString(tab)+"\n");
     }
	
}
