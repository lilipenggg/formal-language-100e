
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
		result = (isContainsABA(input, false) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
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
