package Algorithms.Sorting;

public class BubbleSort {
    public static void main (String[] args) {
        int[] numbers = {3, 9, 6, 13, 2};
        sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
    public static void sort (int[] numbers) {
        int i, j, temp;
        boolean flag;
        for (i=1; i < numbers.length; i++) {
            flag=true;
            for (j=0; j < numbers.length-i; j++){
                if (numbers[j] > numbers[j+1]) {
                    temp=numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]= temp;
                    flag=false;
                }
            }
            if (flag) return;
        }
    }
}