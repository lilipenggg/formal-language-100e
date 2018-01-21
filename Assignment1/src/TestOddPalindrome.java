
public class TestOddPalindrome {

	public static void main(String[] args) {
		
		// Check if the argument is valid when calling this program
		if (args.length != 1)
		{
			System.err.println("Usage: java TestOddPalindrome abba");
			System.exit(1);
		}
		
		String input = args[0];
		String result = "X = " + input + "\t\t\t Member?\t ";
		result = (isOddPalindrome(input) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isOddPalindrome(String s)
	{		
		// Base case 
		if (s.equals("a") || s.equals("b"))
			return true;
		
		if (s.charAt(0) == s.charAt(s.length() - 1))
		{
			if (s.length() == 2)
				return true;
			
			if (s.charAt(0) == 'a' || s.charAt(0) == 'b' || s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'b')
				return isOddPalindrome(s.substring(1, s.length() - 1));	
		}
		
		return false;
	}

}
