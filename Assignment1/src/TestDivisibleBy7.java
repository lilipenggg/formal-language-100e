
public class TestDivisibleBy7 {

	public static void main(String[] args) {
		
		// Check if there is argument when calling this program
		if (args.length != 1 || !isInteger(args[0]))
		{
			System.err.println("Usage: java TestDivisibleBy7 28");
			System.exit(1);
		}
		
		int num = Integer.valueOf(args[0]);
		
		String result = "X = " + args[0] + "\t\t\t Member?\t ";
		result = (isDivisibleBy7(num) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isDivisibleBy7(int n)
	{
		// Terminate condition
		if (n < 7)
			return false;
		
		// Base case
		if (n == 7)
			return true;
		
		return isDivisibleBy7(n - 7);
	}
	
	public static boolean isInteger(String s)
	{
		try 
		{
			Integer.valueOf(s);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

}
