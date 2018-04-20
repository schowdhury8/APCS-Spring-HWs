//Team BarbieStroller: Shayan Chowdhury & Thet Htay Zaw
//APCS2 pd2
//HW34 -- The English Do Not Wait In Line
//2018-04-16 T

import java.util.ArrayList;

public class ALQueue<T> implements Queue<T> {
    private ArrayList<T> _stack;
    private T _head;
    private T _tail;
    private int _size;

    public ALQueue() {
        _stack = new ArrayList<T>();
        _size = 0;
    }

    public T dequeue() {
        if (!isEmpty()) {
            T tmp = _head;
            _head = _stack.get(_stack.size()-_size);
            _size--;
            return (T)tmp;
        }
        return null;
    }

    public void enqueue(T x) {
        _stack.add(x);

        if (_size == 1)
            _head = _stack.get(0);

        _tail = _stack.get(_stack.size()-1);
        _size++;
    }

    public boolean isEmpty() {
        return _size == 0;
    }

    public T peekFront() {
        return (T)_stack.get(_stack.size()-_size);
    }
}