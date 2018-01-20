
public class TestSumXY {

public static void main(String[] args) {
		
		// Check if the argument is valid when calling this program
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
		
		if (num == 17 || num == 43 || num == 43 + 17)
			return true;
		
		return (isSumXY(num - 17) || isSumXY(num - 43) || isSumXY(num - 43 -17));
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
