
public class TestSumXY {

public static void main(String[] args) {
		
		// Check if there is argument when calling this program
		if (args.length != 1 || !isInteger(args[0]))
		{
			System.err.println("Usage: java TestSumXY 12");
			System.exit(1);
		}
		
		int num = Integer.valueOf(args[0]);
		
		String result = "X = " + args[0] + "\t\t\t Member?\t ";
		result = (isSumXY(num) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isSumXY(int num)
	{
		if (num < 17)
			return false;
		
		if (num % 17 == 0 || num % 43 == 0 || num % (17 + 43) == 0)
			return true;
		
		if (num == 17 || num == 43)
			return true;
		
		return false;
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
