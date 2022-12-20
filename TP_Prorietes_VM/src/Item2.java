import java.util.Map;
import java.util.Properties;

public class Item2 
{

	public static void main(String[] args)
	{
		Properties informationSystem=System.getProperties();
		System.out.println("Information  sur le système d'exploitation : ");
		for(Map.Entry<Object, Object> values : informationSystem.entrySet())
		  {
			if (values.getKey().toString().contains("os."))
	            System.out.println(values.getKey() + " = " + values.getValue());
		  }
		System.out.println("\n\n");
		System.out.println("Information  sur la machine virtuelle : ");
		for(Map.Entry<Object, Object> values : informationSystem.entrySet())
		  {
			if (values.getKey().toString().contains("java.vm"))
	            System.out.println(values.getKey() + " = " + values.getValue());
		  }
		System.out.println("\n\n");
		System.out.println("Propriétés de l utilisateur : ");
		for(Map.Entry<Object, Object> values : informationSystem.entrySet())
		  {
			if (values.getKey().toString().contains("user."))
	            System.out.println(values.getKey() + " = " + values.getValue());
		  }
		
	}

}
