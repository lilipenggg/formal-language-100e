//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #2
//                      Dr. Rague
//                      Due: 03/02/18
//                      Version: 1.0
// -----------------------------------------------------------------------
// TestCFG2 is a test program that accepts language that contains words
// of length 1 or greater that do not contain the substring aa
// -----------------------------------------------------------------------
public class TestCFG2
{

	public static void main(String[] args) 
	{
		// Language: strings of length 1 or greater that do not 
		// contain the substring aa
		String[] C = { "S=>aX", 
					   "S=>a", 
					   "S=>bS", 
					   "S=>b", 
					   "X=>bS", 
					   "X=>b" };

		String inString, startWkString;
		boolean accept1;
		CFG CFG2 = new CFG(C);
		if (args.length >= 1) {
			// Input string is command line parameter
			inString = args[0];
			char[] startNonTerm = new char[1];
			startNonTerm[0] = CFG2.getStartNT();
			startWkString = new String(startNonTerm);
			accept1 = CFG2.processData(inString, startWkString);
			System.out.println("  Accept String?  " + accept1);
		}
	} // end main

}
