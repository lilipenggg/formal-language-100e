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
		String[] C = { "S=>aXb", "S=>ab", "X=>aaXbb", "X=>aabb" };

		String inString, startWkString;
		boolean accept1;
		CFG CFG1 = new CFG(C);
		if (args.length >= 1) {
			// Input string is command line parameter
			inString = args[0];
			char[] startNonTerm = new char[1];
			startNonTerm[0] = CFG1.getStartNT();
			startWkString = new String(startNonTerm);
			System.out.println(" Start working string:" + startWkString);
			accept1 = CFG1.processData(inString, startWkString);
			System.out.println("  Accept String?  " + accept1);
		}
	} // end main

}
