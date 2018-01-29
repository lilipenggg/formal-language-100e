//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/26/18
//                      Version: 1.0
// -----------------------------------------------------------------
// This program validates whether a string is an odd palindrome 
// and is composed of valid alphabets
// -----------------------------------------------------------------

// -----------------------------------------------------------------
// This class represents the test class for validating if a 
// string is an odd palindrome.
// ----------------------------------------------------------
public class TestOddPalindrome {

	// -----------------------------------------------------------------
	// This is the main function that executes the program
	// ----------------------------------------------------------
	public static void main(String[] args) {
		
		// Check if there is one argument being passed in when calling this program
		if (args.length != 1)
		{
			System.err.println("Usage: java TestOddPalindrome abba");
			System.exit(1);
		}
		
		// Compute and print the result in console
		String input = args[0];
		String result = "X = " + input + "\t\t\t Member?\t ";
		result = (isOddPalindrome(input) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	// -----------------------------------------------------------------
	// This is the function that verifies that a string is an 
	// odd palindrome in a recursive way.
	// ----------------------------------------------------------
	public static boolean isOddPalindrome(String s)
	{		
		// Base case 
		if (s.equals("a") || s.equals("b"))
			return true;
		
		if (s.charAt(0) == s.charAt(s.length() - 1))
		{
			if (s.length() == 1)
				return true;
			else if (s.length() == 2)
				return false; // This is an odd palindrome - there should not be two characters left
			
			if (s.charAt(0) == 'a' || s.charAt(0) == 'b' || s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'b')
				return isOddPalindrome(s.substring(1, s.length() - 1));	
		}
		
		return false;
	}

}
