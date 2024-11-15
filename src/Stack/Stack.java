package Stack;

public interface Stack {
    // Size
    public int size();
    // isEmpty
    public boolean isEmpty();
    // top
    public Object top() throws StackEmptyException;
    // push
    public void push(Object item) throws StackOverflowException;
    // pop
    public Object pop() throws StackEmptyException;
}
