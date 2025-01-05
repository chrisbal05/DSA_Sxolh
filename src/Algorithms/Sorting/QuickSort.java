package Algorithms.Sorting;

class QuickSort {
    public static void main (String[] args) {
        int[] numbers = {3, 9, 6, 1, 2, 5};
        qsort (numbers, 0, numbers.length-1);
        for (int i = 0; i < numbers.length; i++)
            System.out.println (numbers[i]);
    }
    public static void qsort(int a[], int left, int right) {
        int l, r, pivot, temp;
        if (left < right) {
            l = left; r = right;
            pivot = a[right];
            while (l<r) {
                while ((l < r) && (a[l] <= pivot)) l = l+1;
                while ((l < r) && (a[r] >= pivot)) r = r-1;
                if (l < r) {
                    temp = a[l];
                    a[l] = a[r];
                    a[r] = temp;
                }
            }
            a[right] = a[l];
            a[l] = pivot;
            qsort( a, left, l-1 );
            qsort( a, l+1, right );
        }
    }
}
