import java.util.Map;
import java.util.Properties;

public class Item1 
{

	public static void main(String[] args)
	{
		Properties informationSystem=System.getProperties();
		  for(Map.Entry<Object, Object> values : informationSystem.entrySet())
		  {
	            System.out.println(values.getKey() + " = " + values.getValue());
		  }

}
}
