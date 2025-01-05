package Algorithms.Recursion;

public class Power {
    public static double power (double base, double exp){
        if (exp != 0)
            return (base * power(base, exp - 1));
        else
            return 1;
    }
}
