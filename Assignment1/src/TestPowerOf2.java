//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/26/18
//                      Version: 1.0
// --------------------------------------------------------------------
// This program validates whether a number is a power of 2
// --------------------------------------------------------------------

// -----------------------------------------------------------------
// This class represents the test class for validating if a 
// number is a power of 2.
// ----------------------------------------------------------
public class TestPowerOf2 {

	// -----------------------------------------------------------------
	// This is the main function that executes the program
	// ----------------------------------------------------------
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
	
	// -----------------------------------------------------------------------------
	// This is the recursive function that checks whether a number is a power of 2,
	// it will return true if the number is power of 2 otherwise false
	// -----------------------------------------------------------------------------
	public static boolean isPowerOf2(double n) 
	{	
		
		if (n == 1)
			return true;
		
		if (n < 1)
			return false;
		
		return isPowerOf2((double)n / 2);
	}
	
	// -----------------------------------------------------------------------------
	// This is function checks whether the user input is a number
	// -----------------------------------------------------------------------------
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
