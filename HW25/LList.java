// Shayan Chowdhury
// APCS2 pd2
// HW25 -- Generically Speaking...
// 2018-03-26 M

public class LList<T> implements List{
    
    private DLLNode _head, _tail;
    private int _size;
    
    public LList(){
        _size = 0;
    }
    
    //add node to list, containing input String as its data
    public boolean add( T x ){
        if (_size == 0) _head = new DLLNode(x, null, null);
        else if (_size == 1){
            _tail = new DLLNode(x, _head, null);
            _head.setNext(_tail);
        } else {
            _tail = new DLLNode(x, _tail, null);
            _tail.getPrev().setNext(_tail);
        }
        _size ++;
        return true;
    }
    
    //inserts a node containing s at position I
    public void add( int i, T s ){
        if (i == 0){
            _head = new DLLNode(s, null, _head);
            _head.getNext().setPrev(_head);
        } else if (i == _size){
            _tail = new DLLNode(s, _tail, null);
            _tail.getPrev().setNext(_tail);
        } else {
            DLLNode n = _head;
            while (i > 1){
                n = n.getNext();
                i --;
            }
            DLLNode newNode = new DLLNode(s, n, n.getNext());
            n.setNext(newNode);
            newNode.getNext().setPrev(newNode);
            
        }
        _size ++;
    }

    //removes the node at position i and returns its cargo
    public T remove( int i ){
        T s;
        if (i == 0){
            s = _head.getCargo();
            _head = _head.getNext();
            if (_size > 1) _head.setPrev(null);
        } else if (i == _size - 1){
            s = _tail.getCargo();
            _tail = _tail.getPrev();
            _tail.setNext(null);
        } else {
            DLLNode n = _head;
            while (i > 1){
                n = n.getNext();
                i --;
            }
            s = n.getNext().getCargo();
            n.setNext( n.getNext().getNext() );
            n.getNext().setPrev(n);
        }
        _size --;
        return s;
    }

    //return data in element at position i
    public T get( int i ){
        DLLNode n = _head;
        while (i > 0){
            n = n.getNext();
            i --;
        }
        return n.getCargo();
    }

    //overwrite data in element at position i
    public T set( int i, T x ){
        DLLNode n = _head;
        while (i > 0){
            n = n.getNext();
            i --;
        }
        return n.setCargo(x);
    }

    //return length of list
    public int size(){ return _size; }
    
    public String toString(){
        String s = "[head] -> ";
        DLLNode n = _head;
        while (n != null){
            s += n + " -> ";
            n = n.getNext();
        }
        s += "[tail]";
        return s;
    }
    
    public static void main(String[] args){
        
        LList l = new LList();
        l.add("a");
        l.add("b");
        l.add("c");
        System.out.println(l);
        System.out.println(l.get(1)); // b
        
        l.set(2, "p");
        System.out.println(l);
        
        l.add("r");
        System.out.println(l.size()); // 4
        
        l.add(3, "s");
        System.out.println(l);
        System.out.println(l.size()); // 5
        
        System.out.println(l.remove(2)); // b
        System.out.println(l);
        System.out.println(l.size()); // 4
        
        l.add(1, "x");
        System.out.println(l);
        
        System.out.println(l.remove(4)); // p
        System.out.println(l);
    }
}
