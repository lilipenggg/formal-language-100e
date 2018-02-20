
public class CFG 
{
	private String[] Code; // production rules for this CFG
	private char startNT; // starting nonterminal
	
	public CFG(String[] C)
	{
		Code = C;
	}
	
	public char getStartNT()
	{
		return startNT;
	}
	
	public void setStartNT(char stNT)
	{
		startNT = stNT;
	}
	
	public boolean processData(String inString, String wkString)
	{
		
	}
	
}
