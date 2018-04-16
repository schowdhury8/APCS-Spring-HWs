// Shayan Chowdhury
// APCS2 pd2
// HW21 - Rockin Through the Night
// 2018-03-20

/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode
{
    //instance vars
    private String cargo;
    private LLNode nextNode;

    // constructor -- initializes instance vars
    public LLNode(String car, LLNode nxt) {
        cargo = car;
        nextNode = nxt;
    }

    //--------------v  ACCESSORS  v--------------
    public String getCargo() 
    {
        return cargo;
    }

    public LLNode getNext() 
    {
        return nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo )
    {
        String oldVal = cargo;
        cargo = newCargo;
        return oldVal;    
    }

    public LLNode setNext( LLNode newNext )
    {
        LLNode oldVal = nextNode;
        nextNode = newNext;
        return oldVal;
    }
    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString()
    {
        return cargo;
    }


    //main method for testing
    public static void main( String[] args )
    {

    }//end main

}//end class LLNode

