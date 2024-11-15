package Queue;

import java.util.Arrays;

public class ArrayQueue implements Queue {
    //Xarakthristika Ouras
    public static final int CAPACITY = 1000;
    private Object Q[];
    private int front;
    private int rear;

    //Constructors
    public ArrayQueue( ) {
        this(CAPACITY);
    }
    public ArrayQueue(int cap) {
        front = 0;
        rear = 0;
        Q = new Object[cap];
    }

    @Override
    public int size() {
        return Q.length;
    }

    @Override
    public boolean isEmpty() {
        if (front == rear){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException("Queue is empty");
        return Q[front];
    }

    @Override
    public void enqueue(Object item) throws QueueFullException {
        if (rear == Q.length)
            throw new QueueFullException("Queue overflow");
        Q[rear] = item;
        rear++;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (rear == 0){
            throw new QueueEmptyException("Queue is empty");
        }
        Object ret = Q[front];
        Q[front] = null;
        front++;
        return ret;

    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "Q=" + Arrays.toString(Q) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
