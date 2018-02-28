//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #2
//                      Dr. Rague
//                      Due: 03/02/18
//                      Version: 1.0
// -----------------------------------------------------------------------
// TestCFG1 is a test program that accepts language that contains words
// that start with an odd number of a's followed by the same number of b's
// -----------------------------------------------------------------------
public class TestCFG1 
{

	public static void main(String[] args) 
	{
		// Language: strings that contain odd number of a's followed by the
		// same number of b's.
		String[] C = { "S=>aXb", 
					   "S=>ab", 
					   "X=>aaXbb", 
					   "X=>aabb" };

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
