package Queue;
import java.util.Scanner;

// Askhsh apo tis diafaneies toy ougiaroglou

public class prakseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dwse parastasi");
        ArrayQueue pr = new ArrayQueue(10);
        boolean flag = true;
        String c;
        while (flag == true){
            c = sc.next();
            if (c.equals("0")){
                flag = false;
            }
            else if (c.equals("*")) {
                pr.dequeue();
            }
            else {
                pr.enqueue(c);
            }
        }

        System.out.println(pr.toString());


    }

}
