// Shayan Chowdhury
// APCS pd2
// HW30 -- Stacks on Stacks on Stacks on Stacks…
// 2018-04-10 T

/*****************************************************
 * skeleton for class Latkes
 * Implements a stack of Strings using an encapsulated array
 *****************************************************/

public class Latkes
{
  private String [] _stack;
  private int _stackSize;

  //constructor
  public Latkes( int size )
  {
    _stack = new String[size];
    _stackSize = 0;
  }

  //means of insertion
  public void push( String s )
  {
    if (!isFull()) {
      _stack[_stackSize] = s;
      _stackSize++;
    }
  }

  //means of removal
  public String pop( )
  {
    if (!isEmpty()) {
      String s = _stack[_stackSize - 1];
      _stack[_stackSize - 1] = null;
      _stackSize--;
      return s;
    }
    return null;
  }

  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }

  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }


  //main method for testing
  public static void main( String[] args )
  {
    Latkes tastyStack = new Latkes(10);
    
    tastyStack.push("aoo");
      tastyStack.push("boo");
      tastyStack.push("coo");
      tastyStack.push("doo");
      tastyStack.push("eoo");
      tastyStack.push("foo");
      tastyStack.push("goo");
      tastyStack.push("hoo");
      tastyStack.push("ioo");
      tastyStack.push("joo");
      tastyStack.push("coocoo");
      tastyStack.push("cachoo");

      //cachoo >> joo
      System.out.println( tastyStack.pop() );
      //coocoo >> ioo
      System.out.println( tastyStack.pop() );
      //joo >> hoo
      System.out.println( tastyStack.pop() );
      //ioo >> goo
      System.out.println( tastyStack.pop() );
      //hoo >> foo
      System.out.println( tastyStack.pop() );
      //goo >> eoo
      System.out.println( tastyStack.pop() );
      //foo > doo
      System.out.println( tastyStack.pop() );
      //eoo >> coo
      System.out.println( tastyStack.pop() );
      //doo >> boo
      System.out.println( tastyStack.pop() );
      //coo >> aoo
      System.out.println( tastyStack.pop() );
      //boo >> null
      System.out.println( tastyStack.pop() );
      //aoo >> null
      System.out.println( tastyStack.pop() );
      
      // Wouldn't "coocoo" and "cachoo" just not get added to the stack due to size limits?
      // So, how does the first output check out?

      //stack empty by now; SOP(null)
      System.out.println( tastyStack.pop() );
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
      
  }//end main()

}//end class Latkes
