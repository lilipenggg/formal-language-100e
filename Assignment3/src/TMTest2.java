// Test Turing Machine Class
public class TMTest2
{
  public static void main(String[] args)
  {
    // Language: strings that contain N b's (N > 0, N is an integer) followed by N+1 a's
    String[] C  =
      {"0,b=>B,R,1",
       "1,b=>b,R,1",
       "1,A=>A,R,1",
       "1,a=>A,L,2",
       "2,A=>A,L,2",
       "2,B=>B,R,4",
       "2,b=>b,L,3",
       "3,B=>B,R,0",
       "4,A=>A,R,4",
       "4,a=>A,R,5",
       "5,#=>#,R,6"};
    char[] ST = {'R','R','R','R','R','R','H'};

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
