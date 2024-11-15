package Queue;

public interface Queue {
    public int size( );
    // επιστρέφει το µέγεθος (αριθµός στοιχείων) της ουράς
    public boolean isEmpty( );
    // αληθεύει εάν η ουρά είναι κενή
    public Object front( ) throws QueueEmptyException;
    // επιστρέφει το στοιχείο που βρίσκεται στo εµπρός µέρος της  ουράς
    public void enqueue(Object item) throws QueueFullException;;
    // εισάγει ένα νέο στοιχείο στο πίσω µέρος της ουράς
    public Object dequeue( ) throws QueueEmptyException;
    // εξάγει και επιστρέφει το στοιχείο που βρίσκεται
    // στo εµπρός µέρος της ουράς
}
