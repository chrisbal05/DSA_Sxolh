package Linked_List;

public class LinkedList implements List {
    private SLLNode first;
    private SLLNode last;

    public LinkedList() {
        first = last = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public SLLNode getFirst(){
        return first;
    }

    public SLLNode getLast(){
        return last;
    }

    @Override
    public int size() {
        int size = 0;
        SLLNode pos = first;
        while(pos != null){
            pos = pos.getNext();
            size++;
        }
        return size;
    }

    @Override
    public void insertFirst(Object data) {
        if (isEmpty()){
            first = last = new SLLNode(data, null);
        }
        else{
            first = new SLLNode(data, first);
        }
    }

    @Override
    public void insertLast(Object data) {
        if (isEmpty()){
            first = last = new SLLNode(data, null);
        }
        else{
            SLLNode temp = new SLLNode(data, null);
            last.setNext(temp);
            last = temp;
        }
    }

    @Override
    public Object removeFirst() throws ListEmptyException {
        if (isEmpty()){
            throw new ListEmptyException("List is Empty!");
        }
        Object removedItem = first.getData();
        if (first == last){
            first = last = null;
        }
        else{
            first = first.getNext();
        }
        return removedItem;
    }

    @Override
    public Object removeLast() throws ListEmptyException {
        if (isEmpty()){
            throw new ListEmptyException("List is Empty!");
        }
        Object removedItem = last.getData();
        if (first == last){
            first = last = null;
        }
        else{
            SLLNode position;
            for (position = first; position.getNext() != last; position = position.getNext()){

            };
            last = position;
            position.setNext(null);
        }
        return removedItem;
    }

    public void printLList() throws ListEmptyException{
        if(isEmpty()){
            throw new ListEmptyException("List is Empty!");
        }
        SLLNode pos;
        for (pos = first; pos != null; pos = pos.getNext()){
            System.out.println(pos.getData());
        }
    }

}
