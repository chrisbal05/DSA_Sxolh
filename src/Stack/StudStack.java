package Stack;
import java.util.Scanner;

public class StudStack {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);

        // Create stack of Students
        System.out.println("Dwse megethos stoivas: ");
        int size = sc.nextInt();
        ArrayStack Students = new ArrayStack(size);

        // Eisagwgh foitith sth stoiva
        Student s1 = new Student(12483, "Chris", "Ballhysa", 8.6);
        Student s2 = new Student(43466, "Vaggelis", "Tzimas", 7.9);
        Student s3 = new Student(99999, "Aitze", "Doubi", 9.2);
        System.out.println(Students.pop());
        Students.push(s1);
        System.out.println(Students.top());
        Students.push(s3);
        System.out.println(Students.pop());
        Students.push(s2);
        Students.push(s3);
        Students.push(s1);
        System.out.println(Students.top());
        System.out.println(Students.size());
        System.out.println(Students.isEmpty());
        System.out.println(Students.pop());
    }
}
