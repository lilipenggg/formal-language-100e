//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #2
//                      Dr. Rague
//                      Due: 03/02/18
//                      Version: 1.0
// --------------------------------------------------------------------
// CFG class is used for determining whether a string is in the language
// represented by the Context Free Grammar that this class represented. 
// --------------------------------------------------------------------
import java.util.regex.Pattern;

public class CFG 
{
	private String[] Code; // production rules for this CFG
	private char startNT; // starting nonterminal
	
	/*
	 * constructor of CFG class, it takes one argument C which represents the production rules
	 * of this CFG. by default, the starting terminal is the LHS value for the first production rule.
	 */
	public CFG(String[] C)
	{
		Code = C;
		startNT = C[0].charAt(0); 
	}
	
	/*
	 * getStartNT getter method returns the starting terminal of the CFG.
	 */
	public char getStartNT()
	{
		return startNT;
	}
	
	/*
	 * setStartNT setter method sets the starting terminal of the CFG.
	 */
	public void setStartNT(char stNT)
	{
		startNT = stNT;
	}
	
	/*
	 * processData takes two arguments, inString is the user input string, and wkString is the working string in the CFG.
	 * this method helps user determine whether the input string is in the language represented by the CFG.
	 */
	public boolean processData(String inString, String wkString)
	{
		// terminate statement - the input string is in the language when input string equals to working string
		if (inString.equals(wkString))
			return true;

		// terminate statement - the input string is not in the language when the length of working string is greater than input string
		if (wkString.length() > inString.length())
			return false;

		// iterate through all the production rules
		for (int j = 0; j < Code.length; j++)
		{
			String pr = Code[j];
			String nt = String.valueOf(pr.charAt(0));
			String rhs = pr.substring(3);
			
			// get the index position of the non-terminal state in the working string
			int index = wkString.indexOf(nt);
			
			if (index != -1)
			{	
				// construct a new string that substitute the nonterminal within working string
				String nwk = wkString.replaceFirst(Pattern.quote(nt), rhs);
				return processData(inString, nwk);
			}
			else
				return false; // when no nonterminals exist in working string
		}
		
		return false;
	}
	
}
