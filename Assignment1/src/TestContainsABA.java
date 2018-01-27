//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #1
//                      Dr. Rague
//                      Due: 01/26/18
//                      Version: 1.0
// -----------------------------------------------------------------
// This program validates whether a string contains substring aba 
// and is composed of valid alphabets
// -----------------------------------------------------------------

// -----------------------------------------------------------------
// This class represents the test class for validating if a 
// string contains aba with valid alphabet
// ----------------------------------------------------------
public class TestContainsABA {

	// -----------------------------------------------------------------
	// This is the main function that executes the program
	// ----------------------------------------------------------
	public static void main(String[] args) {
		
		// Check if there is one argument being passed in when calling this program
		if (args.length != 1)
		{
			System.err.println("Usage: java TestContainsABA abaaba");
			System.exit(1);
		}
		
		// Compute and print the result in console
		String input = args[0];
		String result = "X = " + input + "\t\t\t Member?\t ";
		result = (isContainsABA(input, false) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	// -----------------------------------------------------------------
	// This is the recursive function that checks whether a string
	// contains aba
	// ----------------------------------------------------------
	public static boolean isContainsABA(String s, boolean contains)
	{	
		// Verify that all the characters in the string are in alphabet
		if (!isValidAlphabet(s))
			return false;
		
		if (s.length() >= 3) 
		{
			// Set contains to true when encounters a group of aba
			if (s.charAt(0) == 'a' && s.charAt(1) == 'b' && s.charAt(2) == 'a' && !contains)
				contains = true;
			
			return (s.length() == 3) ? contains : isContainsABA(s.substring(1), contains);
		}
		else 
		{
			return (s.length() > 1) ? isContainsABA(s.substring(1), contains) : contains;
		}
	}
	
	// ---------------------------------------------------------------------------
	// This recursive function checks whether a string contains invalid alphabet
	// --------------------------------------------------------------------------
	public static boolean isValidAlphabet(String s)
	{
		
		if (s.equals("a") || s.equals("b"))
			return true;
		
		if (s.length() > 1)
		{
			if (s.charAt(0) == 'a' || s.charAt(0) == 'b')
				return isValidAlphabet(s.substring(1));
		}
		
		return false;
	}

}
