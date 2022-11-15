import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Item2 
{
	 public static void main(String[] args) {
	        File fichier = new File("infos_new.properties");
	        try(FileReader lecturefichier = new FileReader(fichier);
	            BufferedReader bufferlire =new BufferedReader(lecturefichier)){
	            String lire;
	            while ((lire = bufferlire.readLine()) != null)
	                System.out.println(lire);
	        }catch (IOException e){
	            System.err.println("error : " + e.getMessage());
	        }
	     
	    }
	
}
// Les commentaires sont affichés apres lecture du ficher :-)
