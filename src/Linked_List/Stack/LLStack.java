package Linked_List.Stack;
import Linked_List.LinkedList;
import Linked_List.ListEmptyException;
import Stack.Stack;

public class LLStack implements Stack {
    private LinkedList S;

    public LLStack() {
        S = new LinkedList();
    }

    @Override
    public int size() {
        return S.size();
    }

    @Override
    public boolean isEmpty() {
        return S.isEmpty();
    }

    //1os tropos
//    @Override
//    public Object top() throws ListEmptyException {
//        if (isEmpty()){
//            throw new ListEmptyException("H stoiva einai adeia!");
//        }
//        return S.getFirst();
//    }
    //2os tropos
    public Object top( ) throws ListEmptyException{
        if(S.isEmpty()) throw new ListEmptyException("Empty Stack!");
        Object temp = S.removeFirst();
        S.insertFirst(temp);
        return temp;
    }

    @Override
    public void push(Object item) {
        S.insertFirst(item);
    }

    @Override
    public Object pop() throws ListEmptyException {
        try{
            return S.removeFirst();
        }
        catch(ListEmptyException str) {
            throw new ListEmptyException("EmptyStack");
        }
    }
}
