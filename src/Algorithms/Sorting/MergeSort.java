package Algorithms.Sorting;

public class MergeSort {
    public static void main (String[] args) {
        int[] numbers={3, 9, 6, 1, 2};
        sort(numbers, 0, numbers.length-1);
        for (int i=0; i<numbers.length; i++)
            System.out.println (numbers[i]);
    }

    public static void sort (int[] A, int l, int r) {
        if (l==r) return;
        int mid=(l+r)/2;
    //Μεσαία θέση του πίνακα
        sort (A, l, mid);
        //Αναδρομική κλήση για το 1ο μισό
        sort (A, mid+1, r); // Αναδρομική κλήση για το 2ο μισό
        merge(A,l,r,mid);
        // Συγχώνευση των δύο υπο-πινάκων
    }
    public static void merge (int A[], int l, int r, int mid) {
        int n = r-l+1;
        int b[] = new int[n];
        int i1=l, i2=mid+1, j=0;
        while (i1<=mid && i2<=r) {
            if (A[i1] < A[i2]) {
                b[j]=A[i1];
                i1++;
            }
            else {
                b[j]=A[i2];
                i2++;
            }
            j++;
        }
        for (int i=i1; i<=mid; i++){
            b[j]=A[i];
            j++;
        }
        for (int i=i2; i<=r; i++){
            b[j]=A[i];
            j++;
        }
        for (j=0; j<n; j++)
            A[l+j]=b[j];
    }
}