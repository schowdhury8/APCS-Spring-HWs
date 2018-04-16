// Shayan Chowdhury
// APCS2 pd2
// HW24 - On the DLL
// 2018-03-23

public LList implements List {
    
    private DLLNode _head;
    private int _size;

    public LList() {
        _head = null;
        _size = 0;
    }

    public boolean add(String s) {
        _head = new DLLNode(s, _head, null);
        return true;
    }

    public String get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
            
        DLLNode tmp = _head;
        
        for (int i = 0; i < index; i++)
            tmp = tmp.getNext();
            
        return tmp.getCargo();
    }

    public String set(int index, String newVal) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
            
        DLLNode tmp = _head;
        
        for (int i = 0; i < index; i++)
            tmp = tmp.getNext();

        return tmp.setCargo(newVal);
    }

    public int size() {
        return _size;
    }

    public void add(int index, String newVal) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        DLLNode tmp = _head;

		for (int i = 0; i < index-1; i++)
			tmp = tmp.getNext();

		DLLNode next = tmp.getNext();
		tmp.setNext(new LLNode (newVal, next));
    }

    public String remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

            DLLNode tmp = _head;

            for (int i = 0; i < index-1; i++)
                tmp = tmp.getNext();
    
            String val = tmp.getNext();
    
            tmp.setNext(tmp.getNext().getNext());
    
            return val;
    }

    public String toString() {
        String retStr = "HEAD->";
		LLNode tmp = _head; //init tr
		while (tmp != null) {
			retStr += tmp.getCargo() + "->";
			tmp = tmp.getNext();
		}
		retStr += "NULL";
		return retStr;
    }
}