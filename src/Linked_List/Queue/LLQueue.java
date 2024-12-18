package Linked_List.Queue;

import Linked_List.LinkedList;
import Linked_List.ListEmptyException;
import Queue.Queue;

public class LLQueue implements Queue {
    private LinkedList Q;
    public LLQueue( ) {
        Q=new LinkedList();
    }
    public int size() {
        return Q.size();
    }
    public boolean isEmpty() {
        return Q.isEmpty();
    }

    public Object front( ) throws ListEmptyException
    {
        Object temp;
        if(Q.isEmpty()) throw new ListEmptyException("Empty Queue!");
        temp = Q.removeFirst();
        Q.insertFirst(temp);
        return temp;
    }
    public void enqueue(Object item) throws ListEmptyException
    {
        Q.insertLast(item);
    }

    public Object dequeue( ) throws ListEmptyException
    {
        try{
            return Q.removeFirst();
        }
        catch(ListEmptyException str) {
            throw new ListEmptyException("EmptyQueue");
        }
    }
}
