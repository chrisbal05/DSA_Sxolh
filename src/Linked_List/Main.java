package Linked_List;

public class Main {
    public static void main(String[] args) {
         LinkedList L1 = new LinkedList();

         L1.insertLast("Chris");
         L1.insertLast("Vaggelis");
         L1.insertLast("Iasonas");
         L1.insertLast("Maggi");

         L1.removeFirst();
         L1.removeLast();

        System.out.println(L1.size());
        L1.printLList();
    }
}
