
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
		result = (isContainsABA(input) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isContainsABA(String s)
	{
		if (s.length() < 3)
			return false;
		
		if (!isValidAlphabet(s)) 
			return false;
		
		// Base case
		if (s.equals("aba"))
			return true;
		
		if (s.charAt(0) == 'a' || s.charAt(0) == 'b' || s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'b')
			return isContainsABA(s.substring(1)) || isContainsABA(s.substring(0, s.length() - 1));
		
		return false;
	}
	
	public static boolean isValidAlphabet(String s)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != 'a' && s.charAt(i) != 'b')
				return false;
		}
		
		return true;
	}

}
