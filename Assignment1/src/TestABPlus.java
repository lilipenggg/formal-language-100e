
public class TestABPlus {

	public static void main(String[] args) {
		
		// Check if the argument is valid when calling this program
		if (args.length != 1)
		{
			System.err.println("Usage: java TestABPlus aba+ba");
			System.exit(1);
		}
		
		String input = args[0];
		String result = "X = " + input + "\t\t\t Member?\t ";
		result = (isABPlus(input, false) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isABPlus(String s, boolean valid)
	{
		// Base case
		if (s.equals("a") || s.equals("b"))
			return true;
		
		if (s.charAt(0) != 'a' && s.charAt(0) != 'b' && s.charAt(0) != '+')
			return false;
		
		if (valid == false && s.charAt(0) == '+')
			return false;
		
		if (s.charAt(s.length() - 1) == '+' && s.length() == 1)
			return false;
		
		if (s.charAt(0) == 'a' || s.charAt(0) == 'b')
			valid = true;
		
		if (s.charAt(0) == '+')
			valid = false;
		
		return isABPlus(s.substring(1), valid);			
	}

}
