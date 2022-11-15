import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Item3 
{
   // apres deplacement du fichier le programme ne fonctionne plus il ne trouve pas le fichier
	
	 public static void main(String[] args) {
	        File fichier = new File("src/infos_new.properties");
	        try(FileReader fileReader = new FileReader(fichier);
	            BufferedReader bufferlire =new BufferedReader(fileReader)){
	            String lire;
	            while ((lire = bufferlire.readLine()) != null)
	                System.out.println(lire);
	        }catch (IOException e){
	            System.err.println("error : " + e.getMessage());
	        }
	     
	    }
}
