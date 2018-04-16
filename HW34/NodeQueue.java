//Shayan Chowdhury
//APCS2 pd2
//HW34 -- The English Do Not Wait In Line
//2018-04-16 M

public class NodeQueue<T> implements Queue<T> {

    private LLNode _head;
    private LLNode _tail;
    private int _size;

    public NodeQueue() {
        _head = _tail = null;
        _size = 0;
    }

    public T dequeue() {
        if (!isEmpty()) {
            LLNode tmp = _head;
            _head = _head.getNext();
            _size--;
            return (T)tmp.getValue();
        }
        return null;
    }

    public void enqueue(T x) {
        LLNode tmp = new LLNode(x, null);
        
        if (isEmpty())
            _head = tmp;
        else
            _tail.setNext(tmp);
            
        _tail = tmp;
        _size++;
    }

    public boolean isEmpty() {
        return _size == 0;
    }

    public T peekFront() {
        return (T)_head.getValue();
    }
    
}