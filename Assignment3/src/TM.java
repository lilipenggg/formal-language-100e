//                      Lili Peng
//                     CS 4110 - 7 am
//                      Assignment #3
//                      Dr. Rague
//                      Due: 04/13/18
//                      Version: 1.0
// ---------------------------------------------------------------------------
// TM class is used to implement the Turing machine, and it can be used
// to determine whether a given input string belongs to the expected language. 
// ---------------------------------------------------------------------------
public class TM 
{
	private String[] code;	// state transition function as code
	private char[] stateType;	// = 'H' if Halt state
	private String tape;		// read/write tape (input string is data)
	private int tapePos;		// tape head position
	private int cstate;		// current state
	
	/*
	 * Constructor of the TM class,
	 * String[] C: the collection of statements that describe the transition of the Turing Machine
	 * char[] ST: corresponding states description for the states
	 */
	public TM(String[] C, char[] ST)
	{
		// Assume current state is initialized to 0, tape is initially empty, tape head is pointing to 0 index
		cstate = 0;
		tape = "#";
		tapePos = 0;
		
		code = C;
		stateType = ST;
	}
	
	/*
	 * Getter method for cstate attribute
	 * Return: current state of the TM
	 */
	public int getState()
	{
		return cstate;
	}
	
	/*
	 * Setter method for cstate attribute
	 */
	public void setState(int state)
	{
		cstate = state;
	}
	
	/*
	 * Setter method for tape attribute
	 */
	public void setTape(String tape)
	{
		this.tape = tape;
	}
	
	/*
	 * Method that transit the current state and tape head of the TM 
	 * to corresponding state and tape head position based on the transition statement
	 */
	public void stateTransition(char input)
	{
		String statement = "";
		for (String c: code)
		{
			int state = Integer.parseInt(String.valueOf(c.charAt(0)));
			char rc = c.charAt(2);
			
			if (cstate == state && input == rc)
			{
				statement = c;
			}
		}
		
		if (!statement.isEmpty())
		{
			// Write new character at current tape head position
			 setTape(tape.substring(0, tapePos) + statement.charAt(5) + tape.substring(tapePos + 1));
			 
			 // Move the tape head to left or right accordingly
			 int ci = statement.lastIndexOf(',');
			 char direction = statement.charAt(7);
			 int next = Integer.parseInt(String.valueOf(statement.charAt(9)));
			 if (direction == 'R')
			 {
				 tapePos++;
				 cstate = next;
			 }
			 else if (direction == 'L')
			 {
				 tapePos--;
				 // Crashes when tape head is moved to the left hand side of the first spot of tape
				 if (tapePos == -1)
				 {
					 // Exit the current method when crashes
					 return;
				 }
				 else
				 {
					 cstate = next;
				 }
			 }
		}
		else
		{
			tapePos = -1;
		}
	}
	
	/*
	 * Method that takes an input string and process it to validate whether it belongs to the language
	 */
	public boolean processData(String input)
	{
		// Place input string onto the tape
		setTape(input + "#");
		
		while (stateType[cstate] == 'R')
		{
			stateTransition(tape.charAt(tapePos));
			if (tapePos == -1)
			{
				break;
			}
		}
		
		if (stateType[cstate] == 'H' && tapePos != -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
