import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Item2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException 
	{
	      System.out.println("Quel fichier log voulez-vous récupérer? :)");
	        String fichierlog = sc.nextLine();
	        String fichierlogextention = fichierlog + ".log";
	        String fichierExcel=fichierlog+".csv";
	       checkFiles(fichierlogextention, fichierExcel);
	    try(   FileWriter ecritureFichier = new FileWriter(fichierExcel))
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
	static void checkFiles(String fichierlog, String fichierExcel) throws IOException
	{
		boolean test=true;
	       try (FileInputStream fis = new FileInputStream(fichierlog)) 
	       {
	            test=true;
	        } catch (IOException e) {
	            test=false;
	        }
	      if (!test) {  throw new FileNotFoundException("Le fichier " + fichierlog+ " n'existe pas.");
		
	       }
	      try (FileInputStream fis = new FileInputStream(fichierExcel)) 
	       {
	            test=true;
	        } catch (IOException e) {
	            test=false;
	        }
	      if (test)
	      {
	            System.out.println("Un fichier " + fichierExcel + " existe déjà.");
	            File testfichierexcel = new File(fichierExcel);
	            if (!testfichierexcel.canWrite()) {
	                throw new IOException("Ce fichier est innacessible ");
	            }
	            System.out.println("Le fichier excel a ete ecrasé");
	        }

	}
}
