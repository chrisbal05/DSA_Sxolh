package Stack;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

//(x+y)*(y-x) Sample correct
//(x+y*)y-x) Sample wrong

public class Parastasi {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Dwse parastash: ");
        String sen = sc.nextLine();
        System.out.println(sen);

        //Character to check
        char charToCheck;

        // Create Stack
        ArrayStack S = new ArrayStack(sen.length());
        for (int i = 0; i <= sen.length()-1; i++){
            charToCheck = sen.charAt(i);
            if (charToCheck == '('){
                S.push(charToCheck);
            }
            if (charToCheck == ')') {
                if (S.isEmpty()){
                    System.out.println("Error in position : " + (i+1));
                }
                else{
                    S.pop();
                }
            }
        }

        if (S.isEmpty()){
            System.out.println("No error!!!");
        }
        else {
            System.out.println("Error in position: " + sen.length());
        }

    }
}
