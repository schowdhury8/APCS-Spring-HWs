// Shayan Chowdhury
// APCS2 pd2
// HW21 - Rockin Through the Night
// 2018-03-20

public class LList implements List {
    
    private LLNode head;
    private int size;

    public boolean add (String x) {
        LLNode node = head; //starts at head node before iterating through the list

        for(int i = 0; i < size; i++) //iterates to last node in list
            node = node.getNext();
        
        node.setNext(new LLNode (x, head));
        size++;

        return true;
    }

    public String get (int index) {
        LLNode node = head; //starts at head node before iterating through the list

        for(int i = 0; i < index; i++)
            node = node.getNext();
        
        return node.getCargo();
    }

    public String set(int i, String x) {
        LLNode node = head; //starts at head node before iterating through the list

        for(int j = 0; i < i; i++)
            node = node.getNext();
        
        String oldVal = node.getCargo();
        node.setCargo(x);
        return oldVal;
    }

    public int size() {
        return size;
    }
}
