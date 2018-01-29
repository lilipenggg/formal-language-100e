//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/26/18
//                      Version: 1.0
// --------------------------------------------------------------------
// This program validates whether a number is in the language of SumXY 
// --------------------------------------------------------------------

// -----------------------------------------------------------------
// This class represents the test class for validating if a 
// number is in the language of SumXY
// ----------------------------------------------------------
public class TestSumXY {

	// -----------------------------------------------------------------
	// This is the main function that executes the program
	// ----------------------------------------------------------
	public static void main(String[] args) {
		
		// Check if the argument is valid when calling this program
		if (args.length != 1 || !isInteger(args[0]))
		{
			System.err.println("Usage: java TestSumXY 12");
			System.exit(1);
		}
		
		// Compute and print the result in console
		int num = Integer.valueOf(args[0]);
		String result = "X = " + args[0] + "\t\t\t Member?\t ";
		result = (isSumXY(num) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	// -----------------------------------------------------------------
	// This is the recursive function that verifies the number
	// is in the language of SumXY
	// ----------------------------------------------------------
	public static boolean isSumXY(int num)
	{
		if (num < 17)
			return false;
		
		if (num == 17 || num == 43)
			return true;
		
		return (isSumXY(num - 17) || isSumXY(num - 43));
	}
		
	// ----------------------------------------------------------------------
	// This is the function that checks whether user input is a valid number
	// ----------------------------------------------------------------------
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
