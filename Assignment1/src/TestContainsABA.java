
public class TestContainsABA {

	public static void main(String[] args) {
		
		// Check if the argument is valid when calling this program
		if (args.length != 1)
		{
			System.err.println("Usage: java TestContainsABA abaaba");
			System.exit(1);
		}
		
		String input = args[0];
		String result = "X = " + input + "\t\t\t Member?\t ";
		result = (isInABA(input, false) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isContainsABA(String s)
	{
//		if (s.length() < 3)
//			return false;
//		
//		if (!isValidAlphabet(s))
//			return false;
//		
//		// Base case
//		if (s.equals("aba"))
//			return true;
//		
//		if (s.startsWith("aba") || s.endsWith("aba"))
//			return true;
//		
//		if (s.charAt(0) == 'a' || s.charAt(0) == 'b' || s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'b')
//			return isContainsABA(s.substring(1)) || isContainsABA(s.substring(0, s.length() - 1));
//	
//		return false;
		
//		if (s.length() < 3)
//			return false;
//		
//		if (s.charAt(0) == 'a')
//		{
//			if (s.charAt(1) == 'b' && s.charAt(2) == 'a')
//				
//		}
		return true;
	}
	
	public static boolean isInABA(String s, boolean contains)
	{	
		System.out.println("Current string: " + s);
		
		// Make sure all the characters in the string are in alphabet
		if (!isValidAlphabet(s))
			return false;
		
		// Terminating condition
		if (s.length() < 3 && contains == false)
			return false;

		if (s.charAt(0) == 'a' && s.length() >= 3)
		{
			// Set the flag to true when ABA is in the string otherwise false
			contains = (s.charAt(1) == 'b' && s.charAt(2) == 'a') ? true : false;
			
			// Move over three characters if the string length is more than 3, 
			// otherwise return the result
			return (s.length() > 3 ? isInABA(s.substring(3), contains) : contains);
		}
		// Check whether there are characters other than a or b in the string
		else if (s.charAt(0) != 'a' && s.charAt(0) != 'b')
		{
			return false;
		}
		// Move to the next character when the first character in the string does not start with a
		else
		{
			// Make sure that this is not the last char in the string
			return ((s.length() > 1) ? isInABA(s.substring(1), contains) : contains);
		}
		
	}
	
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
