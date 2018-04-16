import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {
	private LinkedList<PANCAKE> _stack;

	public ALStack(int size) { //overloaded constructor
		_stack = new ArrayList<PANCAKE>();
		_stackSize = 0;
	}

	public static PANCAKE peek() {
		return _stack.get(_stack.size() - 1);
	}

	public static void push(PANCAKE p) {
		_stack.add(p);
	}

	public static PANCAKE pop() {
		PANCAKE tmp = _stack.peek();
		_stack.remove(_stack.size() - 1);
	}

	public static boolean isEmpty() {
		return _stack.size() == 0;
	}
		
}
