import java.util.Arrays;
public class TriParam
{
    public static void main(String[]args)
    {

    	if (args.length==0)
    		System.out.println("Usage : TriParam argument1 arguement 2 argument 3");
    	else 
    	{	
    			System.out.println("arguments 1 :"+args[0]);
    			System.out.println("arguments 2 :"+args[1]);
    			System.out.println("arguments 3 :"+args[2]);
    		
    	}
	/// tri des arguments 
    	Arrays.sort(args);
    	System.out.println("arguments 1 :"+args[0]);
		System.out.println("arguments 2 :"+args[1]);
		System.out.println("arguments 3 :"+args[2]);
   }
}

		
