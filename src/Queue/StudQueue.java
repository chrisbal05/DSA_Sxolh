package Queue;
import Stack.ArrayStack;
import Stack.Student;

import java.util.Scanner;

public class StudQueue {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);

        // Create queue of Students
        System.out.println("Dwse megethos stoivas: ");
        int size = sc.nextInt();
        ArrayQueue Students = new ArrayQueue(size);

        // Eisagwgh foitith sthn oura
        Student s1 = new Student(12483, "Chris", "Ballhysa", 8.6);
        Student s2 = new Student(43466, "Vaggelis", "Tzimas", 7.9);
        Student s3 = new Student(99999, "Aitze", "Doubi", 9.2);

        System.out.println(Students.isEmpty());
        Students.enqueue(s1);
        Students.enqueue(s2);
        Students.enqueue(s3);
        System.out.println(Students.isEmpty());
        System.out.println(Students.size());
        System.out.println(Students.dequeue());
        System.out.println(Students.dequeue());
        System.out.println(Students.front());


    }
}
