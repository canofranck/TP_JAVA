package bookstore.metier;

import java.text.DecimalFormat;

public class Comptable 
{
	 private double totalPrix;
	 public static final Comptable instance = new Comptable();  // item 4 c est une pattern Creational
	 public static Comptable singletonComptable;
	 private static Comptable getInstance()
	 {
		 if ( singletonComptable==null)
			 singletonComptable=new Comptable();
	        return singletonComptable;
	 }
	 public  void Comptabilise(Livre livre)
	 {
	   if (livre.getPrix() != -1)
	   this.totalPrix = this.totalPrix+livre.getPrix();
	  
	 }
	
	 public Comptable()
	 {
	        this.totalPrix = 0;
	 }
	 public void setTotalPrix(double totalPrix)
	 {
	        this.totalPrix = totalPrix;
	 }
	 public String getTotalPrix()
	 {
		 DecimalFormat prixFormat= new DecimalFormat("00.00€");
	        return  prixFormat.format(totalPrix);
	 }
	    
}
