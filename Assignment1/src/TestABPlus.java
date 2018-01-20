
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
		result = (isABPlus(input) ? result + "true" : result + "false");
		System.out.println(result);
	}
	
	public static boolean isABPlus(String s)
	{
		if (s.equals("a") || s.equals("b"))
			return true;
		
		if (s.length() > 3)
		{
			if (s.startsWith("a+b") || s.startsWith("b+a") || s.startsWith("a+a") || s.startsWith("b+b"))
				return isABPlus(s.substring(3));
			
			if (s.endsWith("a+b") || s.endsWith("b+a") || s.endsWith("a+a") || s.endsWith("b+b"))
				return isABPlus(s.substring(0, s.length() - 3));
		}
		
		if (s.length() > 2)
		{
			if (s.startsWith("ab") || s.startsWith("ba"))
				return isABPlus(s.substring(2));
			if (s.endsWith("ab") || s.endsWith("ba"))
				return isABPlus(s.substring(0, s.length() - 2));
		}
		
		if (s.length() > 1) 
		{
			if (s.charAt(0) == 'a' || s.charAt(0) == 'b')
				return isABPlus(s.substring(1));
			
			if (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'b')
				return isABPlus(s.substring(0, s.length() - 1));
		}
		
		return false;
	}

}
