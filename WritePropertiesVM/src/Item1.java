import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Item1
{

	public static void main(String[] args) 
	{
		Properties informationSystem=System.getProperties();
		 try (FileWriter fichier = new FileWriter("infos.properties")) 
		 {
			  fichier.write("Information  sur le système d'exploitation : \n");
			 for(Map.Entry<Object, Object> values : informationSystem.entrySet())
			 {
				 if (values.getKey().toString().contains("os."))
					 fichier.write(values.getKey() + " = " + values.getValue()+"\n");
			 }
			 fichier.write("\n\n");
			 fichier.write("Information  sur la machine virtuelle : ");
			 for(Map.Entry<Object, Object> values : informationSystem.entrySet())
			 {
				 if (values.getKey().toString().contains("java.vm"))
					 fichier.write(values.getKey() + " = " + values.getValue()+"\n");
			 }
			 fichier.write("\n\n");
			 fichier.write("Propriétés de l utilisateur : ");
			 for(Map.Entry<Object, Object> values : informationSystem.entrySet())
			 {
				 if (values.getKey().toString().contains("user."))
					 fichier.write(values.getKey() + " = " + values.getValue()+"\n");
			 }
		 } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
