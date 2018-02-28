//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #2
//                      Dr. Rague
//                      Due: 03/02/18
//                      Version: 1.0
// -----------------------------------------------------------------------
// TestCFG4 is a test program that accepts language that contains words 
// consisting of all strings that start with z, followed by N x's (N >= 0),
// followed by twice as many y's, and ending with z.
// -----------------------------------------------------------------------
public class TestCFG4
{

	public static void main(String[] args) 
	{
		// Language: strings that start with z, followed
		// by N x's (N >= 0), followed by twice as many y's,
		// and ending with z.
		String[] C = { "S=>zXz",
					   "S=>zz",
					   "X=>xXyy",
					   "X=>xyy" };

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
