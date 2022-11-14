import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Item2

{

	public static void main(String[] args)
	{
	    try
	    {
	      // Le fichier d'entrée
	      File file = new File("D:\\TP_JAVA\\TP_IO_JAVA\\test.txt");    
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(file);  
	      // Créer l'objet BufferedReader        
	      BufferedReader br = new BufferedReader(fr);  
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	        // ajoute la ligne au buffer
	        sb.append(line);      
	        sb.append("\n");     
	      }
	      fr.close();    
	      System.out.println("Contenu du fichier: ");
	      System.out.println(sb.toString());  
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	  }
		
	}
	
	


/// ecriture

//import java.io.*; 
//public class Main {
//  public static void main(String[] args) {
//    try {
//      FileWriter fw = new FileWriter("NouveauFichier.txt");
//      fw.write("Hello, Welcome to WayToLearnX!");
//      fw.close();
//      System.out.println("Le texte a été écrit avec succès");
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
//}
