// Shayan Chowdhury
// APCS pd2
// HW31 -- Stack: What Is It Good For?
// 2018-04-11 W

/*****************************************************
 * skeleton for class LatKtS
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 *****************************************************/

public class LatKtS {

  /**********************************************************
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **********************************************************/
  public static String flip(String s) {
    Latkes stack = new Latkes(s.length());

    for (int i = 0; i < s.length(); i++) {
      stack.push(s.substring(i, i + 1));
    }

    String rev = "";

    while (!stack.isEmpty()) {
      rev += stack.pop();
    }

    return rev;

  }//end flip()

  /**********************************************************
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **********************************************************/
  public static boolean allMatched(String s) {
    if (s.isEmpty()) {
      return true;
    }

    Latkes stack = new Latkes(s.length());

    for (int i = 0; i < s.length(); i++) {
      String op = s.substring(i, i + 1);

      if (op.equals("(") || op.equals("[") || op.equals("{")) { //check if opener is either
        stack.push(op);
      } else {
        if (!stack.isEmpty()) {
          String cl = stack.peek(); //peeking to check the end value

          if (matching(op, cl)) {
            stack.pop();
          } else {
          return false;
          }

          }
        }
        
      }
    return stack.isEmpty();
  }//end allMatched()

  //match checker helper method
  public static boolean matching(String open, String close) {
    return open.equals("(") && close.equals(")") || open.equals("[") && close.equals("]") || open.equals("{") && close.equals("}"); //could use a switch statement for cleaning implementation but we haven't learnt that yet
  }

  //main method to test
  public static void main(String[] args) {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class LatKtS
