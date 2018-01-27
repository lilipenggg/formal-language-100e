//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/26/18
//                      Version: 1.0
// --------------------------------------------------------------------
// This program validates whether a string is in the language of ABPlus 
// and is composed of valid alphabets
// --------------------------------------------------------------------

// -----------------------------------------------------------------
// This class represents the test class for validating if a 
// string is in the language of ABPlus
// ----------------------------------------------------------
public class TestABPlus {

	// -----------------------------------------------------------------
	// This is the main function that executes the program
	// ----------------------------------------------------------
	public static void main(String[] args) {
		
		// Check if there is one argument being passed in when calling this program
		if (args.length != 1)
		{
			System.err.println("Usage: java TestABPlus aba+ba");
			System.exit(1);
		}
		
		// Compute and print the result in console
		String input = args[0];
		String result = "X = " + input + "\t\t\t Member?\t ";
		result = (isABPlus(input, false) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	// -----------------------------------------------------------------
	// This is the recursive function that checks whether a string
	// is in the language of ABPlus in a recursive way
	// ----------------------------------------------------------
	public static boolean isABPlus(String s, boolean valid)
	{
		// Base case
		if (s.equals("a") || s.equals("b"))
			return true;
		
		// Verify the letters in the string are within the alphabet
		if (s.charAt(0) != 'a' && s.charAt(0) != 'b' && s.charAt(0) != '+')
			return false;
		
		// Verify that plus must follow an a or b
		if (valid == false && s.charAt(0) == '+')
			return false;
		
		// Make sure plus sign by itself is not in ABPlus
		if (s.charAt(s.length() - 1) == '+' && s.length() == 1)
			return false;
		
		if (s.charAt(0) == 'a' || s.charAt(0) == 'b')
			valid = true;
		
		if (s.charAt(0) == '+')
			valid = false;
		
		return isABPlus(s.substring(1), valid);			
	}

}
