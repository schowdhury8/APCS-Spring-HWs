//Shayan Chowdhury
//APCS2 pd2
//HW36 -- But Did You Really Learn It?
//2018-04-18 W

/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/


public class RQueue<T> implements Queue<T>
{
  //instance variables
  private LLNode<T> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue() 
	{ 
    _front = _end = null;
		_size = 0;
	}//end default constructor


  public void enqueue( T enQVal ) 
  {
    LLNode tmp = new LLNode(enQVal, _end);
    if (isEmpty()) {
      _front = _end = tmp;
    }

    _end.setNext(tmp);
    _end = _end.getNext();
    size++;
  }//end enqueue()


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue() 
  { 
    if (!isEmpty()) {
      LLNode tmp = _front;
      _front = _front.getNext();
      _size--;
      return (T)tmp.getValue();
  }
  return null;
  }//end dequeue()


  public T peekFront() 
  {
    return (T)_front.getValue();
  }


  /******************************************
   * void sample() -- a means of "shuffling" the queue
   * Algo: Changes the front pointer to point at a random node to dequeue
   * ...
   * 
   ******************************************/
  public void sample () 
  {
    int rando = (int)Math.random()*_size;

    for (int i = 0; i < rando; i++) {
      _front = _front.getNext();
    }
  }//end sample()


  public boolean isEmpty() 
  {
    return _size == 0;
  } //O(1)


    // print each node, separated by spaces
  public String toString() 
  { 
    String s = "";
    
    LLNode tmp = _front;
    while (tmp.getNext() != null) {
      s += tmp + " ";
    }
            return s;
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      Queue<String> PirateQueue = new RQueue<String>();

      System.out.println("\nnow enqueuing..."); 
      PirateQueue.enqueue("Dread");
      PirateQueue.enqueue("Pirate");
      PirateQueue.enqueue("Robert");
      PirateQueue.enqueue("Blackbeard");
      PirateQueue.enqueue("Peter");
      PirateQueue.enqueue("Stuyvesant");

      System.out.println("\nnow testing toString()..."); 
      System.out.println( PirateQueue ); //for testing toString()...

      System.out.println("\nnow dequeuing..."); 
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );

      System.out.println("\nnow dequeuing fr empty queue..."); 
      System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
