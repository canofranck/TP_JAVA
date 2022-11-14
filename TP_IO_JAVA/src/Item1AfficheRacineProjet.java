import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Item1AfficheRacineProjet 
{

	public static void main(String[] args) throws IOException
	{
		
		
	    Path test = Paths.get("e:/TP_JAVA");
	    DirectoryStream<Path> stream = Files.newDirectoryStream(test);
	   	    try { 
	      Iterator<Path> iterator = stream.iterator();
	      while(iterator.hasNext()) {
	        Path p = iterator.next();
	        Boolean type = Files.isDirectory(p);
	        System.out.printf("\t%s%s%s\n",(type?"[":""),p.toString().replaceFirst("\\.\\\\",""),(type?"]":""));
	  
	      }
	    } finally { 
	      stream.close(); 
	    } 

	     	    
	   	    // option avec la classe java.iofile
	   	 System.out.println();  
	   	 System.out.println();
	   	 System.out.println(" classe java.iofile");
	   	 File dir  = new File("D:\\TP_JAVA");
	      File[] liste = dir.listFiles();
	      for(File item : liste){
	        if(item.isFile())
	        { 
	          System.out.format("Nom du fichier   : %s%n", item.getName()); 
	        } 
	        else if(item.isDirectory())
	        {
	          System.out.format("Nom du répertoire: [%s] \n", item.getName()); 
	        } 
	      }
}
}
