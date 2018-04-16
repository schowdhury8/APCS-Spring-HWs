// Shayan Chowdhury
// APCS2 pd2
// HW24 - On the DLL
// 2018-03-23

/*****************************************************
 * class DLLNode
 * Implements a doubly-linked node,
 * for use in lists and other collection classes.
 * Stores data of type String
 *****************************************************/

public class DLLNode 
{
  private String _cargo;    //cargo may only be of type String
  private DLLNode _nextNode, _prevNode; //pointers to next, prev DLLNodes

  public DLLNode(String car, DLLNode nxt, DLLNode prv) {
    _cargo = car;
    _nextNode = nxt;
    _prevNode = prv;
  }

  //--------------v  ACCESSORS  v--------------
	public String getCargo() {
		return _cargo;
	}

	public LLNode getNext() {
		return _nextNode;
  }
  
  public LLNode getPrev() {
    return _prevNode;
  }
	//--------------^  ACCESSORS  ^--------------

	//--------------v  MUTATORS  v--------------
	public String setCargo(String newCargo) {
		String foo = getCargo();
		_cargo = newCargo;
		return foo;
	}

	public LLNode setNext(LLNode newNext) {
		LLNode foo = getNext();
		_nextNode = newNext;
		return foo;
  }
  
	public LLNode setPrev(LLNode newPrev) {
		LLNode foo = getPrev();
		_prevNode = newPrev;
		return foo;
  } 
	//--------------^  MUTATORS  ^--------------

	// override inherited toString
	public String toString() {
		return _cargo; //why call toString of a string in the library version?
	}

}//end class DLLNode
