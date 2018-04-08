// Test Turing Machine Class
public class TMTest4
{
  public static void main(String[] args)
  {
    // Language: strings that contain words having the form of qNpNqN (N > 0, N is an integer)
    String[] C  =
      {"0,q=>Q,R,1",
       "1,q=>q,R,1",
       "1,P=>P,R,1",
       "1,p=>P,L,2",
       "2,P=>P,L,2",
       "2,q=>q,L,3",
       "3,q=>q,L,3",
       "3,Q=>Q,R,0",
       "2,Q=>Q,R,4",
       "4,P=>p,R,5",
       "5,P=>P,R,5",
       "5,Q=>Q,R,5",
       "5,q=>Q,L,6",
       "6,Q=>Q,L,6",
       "6,P=>P,L,7",
       "7,P=>P,L,7",
       "7,p=>p,R,4",
       "6,p=>p,R,8",
       "8,Q=>Q,R,8",
       "8,#=>#,R,9",};
    char[] ST = {'R','R','R','R','R','R','R','R','R','H'};

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
