package Algorithms.Sorting;

public class SelectionSort {
    public static void main (String[] args) {
        int[] numbers = {3, 9, 6, 1, 2};
        sort (numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println (numbers[i]);
    }

    public static void sort (int[] numbers) {
        int min, pos;
        for (int i = 0; i < numbers.length-1; i++){
            min=numbers[i];
            pos = i;
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[j] < min){
                    min=numbers[j];
                    pos = j;
                }
            }
            numbers[pos] = numbers[i];
            numbers[i] = min;
        }
    }
}