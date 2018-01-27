//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/26/18
//                      Version: 1.0
// --------------------------------------------------------------------
// This program validates whether a number is divisible by 7
// --------------------------------------------------------------------

// -----------------------------------------------------------------
// This class represents the test class for validating if a 
// number can be divided by 7.
// ----------------------------------------------------------
public class TestDivisibleBy7 {

	// -----------------------------------------------------------------
	// This is the main function that executes the program
	// ----------------------------------------------------------
	public static void main(String[] args) {
		
		// Check if the argument is valid when calling this program
		if (args.length != 1 || !isInteger(args[0]))
		{
			System.err.println("Usage: java TestDivisibleBy7 28");
			System.exit(1);
		}
		
		// Compute and print the result in console
		int num = Integer.valueOf(args[0]);
		String result = "X = " + args[0] + "\t\t\t Member?\t ";
		result = (isDivisibleBy7(num) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	// -----------------------------------------------------------------
	// This is the recursive function that checks whether the number
	// can be divisible by 7.
	// -----------------------------------------------------------------
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
	
	// -----------------------------------------------------------------
	// This function checks whether the user input is a valid number
	// -----------------------------------------------------------------
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
