//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #2
//                      Dr. Rague
//                      Due: 03/02/18
//                      Version: 1.0
// -----------------------------------------------------------------------
// TestCFG3 is a test program that accepts language that contains strings
// that contain exactly one b, have 2N a's (N >= 0, N is an integer) before
// the b, and 2N+1 a's after the b.
// -----------------------------------------------------------------------
public class TestCFG3
{

	public static void main(String[] args) 
	{
		// Language: strings of length 1 or greater that do not 
		// contain the substring aa
		String[] C = { "S=>ba", 
					   "S=>aaSaa" };

		String inString, startWkString;
		boolean accept1;
		CFG CFG1 = new CFG(C);
		if (args.length >= 1) {
			// Input string is command line parameter
			inString = args[0];
			char[] startNonTerm = new char[1];
			startNonTerm[0] = CFG1.getStartNT();
			startWkString = new String(startNonTerm);
			accept1 = CFG1.processData(inString, startWkString);
			System.out.println("  Accept String?  " + accept1);
		}
	} // end main

}
