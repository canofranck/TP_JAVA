import java.util.Scanner;
import static java.lang.Math.PI;
public class Item3 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		double PI=Math.PI;
		 while (true)
		 {
			 System.out.println("Quel est le diamètre du cercle? taper exit pour terminer le programme ");
			 String d=sc.nextLine();
			 double ddouble=Double.parseDouble(d);
			 float ddfloat=Float.parseFloat(d);
		     double surfaced=(double) (PI*(ddouble*ddouble));
			 float surfacef=(float) (PI*(ddfloat*ddfloat)); 
	         System.out.println("la surface du cercle avec caclcul en double " +surfaced);
             System.out.println("la surface du cercle avec caclcul en float "+surfacef);
             System.out.println();
             if (d.equalsIgnoreCase("exit")) 
			 {
	                break;
	            }
		 }
	}

}
