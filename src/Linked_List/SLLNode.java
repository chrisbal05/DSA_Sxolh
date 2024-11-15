package Linked_List;

public class SLLNode {
    // Instance fields
    private Object data;
    private SLLNode next;
    // Instance methods


    public SLLNode() {
        this(null, null);
    }

    public SLLNode(Object data, SLLNode next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
