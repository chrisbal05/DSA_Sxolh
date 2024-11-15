package Stack;

public class ArrayStack implements Stack {
    //Xarakthristika Stoivas
    public static final int CAPACITY = 1000;
    private Object S[];
    private int top;

    //Constructors
    public ArrayStack( ) {
        this(CAPACITY);
    }
    public ArrayStack(int cap) {
        top = -1;
        S = new Object[cap];
    }

    // Methodos Push (Eisagwgh stoixeiou)
    public void push(Object item) {
        if (size()== S.length){
            throw new StackOverflowException("The stack is full");
        }
        top++;
        S[top] = item;
    }

    // Methodos Pop (Ejagwgh stoixeiou kai emfanisi tou)
    public Object pop(){
        if (isEmpty()){
            throw new StackEmptyException("The stack is empty");
        }
        Object del = S[top];
        S[top] = null;
        top--;
        return del;
    }

//    public boolean isEmpty(){
//        if (S.length == 0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
    public boolean isEmpty(){
        return (top < 0);
    }

    public Object top(){
        if (isEmpty()){
            throw new StackEmptyException("The stack is empty");
        }
        return S[top];
    }

    public int size(){
        return (top+1);
    }
}
