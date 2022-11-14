import java.io.*;
import java.util.Scanner;
public class Item1
{
	
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
	      System.out.println("Quel fichier log voulez-vous récupérer? :)");
	        String fichierlog = sc.nextLine();
	        String fichierlogextention = fichierlog + ".log";
	       
	    try(   FileWriter ecritureFichier = new FileWriter("copie de "+fichierlog+".csv"))
	    		{
	     File fichier = new File(fichierlogextention);
	      try (FileReader lectureFichierLog = new FileReader(fichier);
                  BufferedReader buffer= new BufferedReader(lectureFichierLog))
	      {
                 String pointer;
                 while ((pointer = buffer.readLine()) != null) 
                 {
                   ecritureFichier.append(pointer.split(",")[0]).append(";");
                   ecritureFichier.append(pointer.split(",")[3]).append(";");
                   ecritureFichier.append(pointer.split(",")[13]).append("\n");
           
                 }  
	   
	    ecritureFichier.close();
	    
	     }catch (IOException e) 
	      {
	    	 System.err.println("erreur de fichier");		    
	      }
		}catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	    System.out.println("Le fichier csv a ete creer"); 
	 
	
	}
}
