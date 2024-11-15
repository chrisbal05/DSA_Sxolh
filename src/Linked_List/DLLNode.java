package Linked_List;

public class DLLNode {
    // Instance fields
    private Object data;
    private DLLNode next;
    private DLLNode prev;
    // Instance methods


    public DLLNode() {
        this(null, null, null);
    }

    public DLLNode(Object data, DLLNode next, DLLNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "DLLNode{" +
                "data=" + data +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
