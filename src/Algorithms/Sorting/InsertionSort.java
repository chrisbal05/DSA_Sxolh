package Algorithms.Sorting;

public class InsertionSort {
    public static void main (String[] args) {
        int[] numbers = {3, 9, 6, 1, 2};
        sort (numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println (numbers[i]);
    }
    public static void sort (int numbers []) {
        for (int i=1; i < numbers.length; i++) {
            int current = numbers[i];
            int position=i;
            while (position>0 && numbers[position-1] > current) {
                numbers[position] = numbers[position-1];
                position--;
            }
            numbers[position] = current;
        }
    }
}

// Allo implementation
class InsertionSort_2 {
    public static void sort (int numbers[]) {
        boolean found;
        int j, temp;
        for (int i=1; i < numbers.length; i++) {
            j=0;
            found=false;
            while (j<i && ! found)
                if (numbers[i] < numbers[j])
                    found=true;
                else
                    j=j+1;
            if (found) {
                temp=numbers[i];
                for (int k=i-1; k>=j; k--)
                    numbers[k+1]=numbers[k];
                numbers[j]=temp;
            }
        }
    }
}
