package Algorithms.Sorting;

public class ExchangeSort {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 6, 1, 2};
        sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }
    public static void sort ( int[] numbers){
        int i, j, temp;
        for (i = 0; i < numbers.length - 1; i++)
            for (j = i + 1; j < numbers.length; j++)
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
    }
}