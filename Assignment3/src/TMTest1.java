// Test Turing Machine Class
public class TMTest1
{
  public static void main(String[] args)
  {
    // Language: strings that contain the substring bbb
    String[] C  =
      {"0,a=>a,R,0",
       "0,b=>b,R,1",
       "1,a=>a,R,0",
       "1,b=>b,R,2",
       "2,a=>a,R,0",
       "2,b=>b,R,3",
       "3,a=>a,R,3",
       "3,b=>b,R,3",
       "3,#=>#,R,4"};
    char[] ST = {'R','R','R','R','H'};

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
