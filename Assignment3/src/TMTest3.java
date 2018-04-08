// Test Turing Machine Class
public class TMTest3
{
  public static void main(String[] args)
  {
    // Language: strings that consisting of all odd-length palindrome
    String[] C  =
      {"0,x=>#,R,1",
       "1,y=>y,R,1",
       "1,x=>x,R,1",
       "1,#=>#,L,2",
       "2,#=>#,R,7",
       "2,x=>#,L,3",
       "3,x=>x,L,3",
       "3,y=>y,L,3",
       "3,#=>#,R,0",
       "0,y=>#,R,4",
       "4,y=>y,R,4",
       "4,x=>x,R,4",
       "4,#=>#,L,5",
       "5,#=>#,R,7",
       "5,y=>#,L,6",
       "6,x=>x,L,6",
       "6,y=>y,L,6",
       "6,#=>#,R,0"};
    char[] ST = {'R','R','R','R','R','R','R','H'};

    String inString;
    boolean accept1;
    TM TM1 = new TM(C, ST);
    if(args.length >= 1){
      // Input string is command line parameter
      inString = args[0];
      // Process input string
      accept1 = TM1.processData(inString);
      System.out.println("\n Valid string?   " + accept1);
    }
  }// end main
} // end class
