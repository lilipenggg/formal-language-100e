
public class TestPowerOf2 {

	public static void main(String[] args) {

		// Check if the argument is valid when calling this program
		if (args.length != 1 || !isNumber(args[0]))
		{
			System.err.println("Usage: java TestPowerOf2 128");
			System.exit(1);
		}
				
		double num = Double.valueOf(args[0]);
				
		String result = "X = " + args[0] + "\t\t\t Member?\t ";
		result = (isPowerOf2(num) ? result + "true" : result + "false");
		System.out.println(result);

	}
	
	public static boolean isPowerOf2(double n) 
	{	
		// Check whether n is a whole number
		if (Math.floor(n) != n)
			return false;
		
		if (n == 1)
			return true;
		
		return isPowerOf2((double)n / 2);
	}
	
	public static boolean isNumber(String s)
	{
		try 
		{
			Double.valueOf(s);
			return true;
		}
		catch (NumberFormatException e)
		{
			return false;
		}
	}

}
