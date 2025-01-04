package Algorithms.Searching;

public class RecBinSearch {
        public static void main (String[] args) {
            int a[] = {1, 4, 15, 27, 39, 40, 57, 63};
            int key = 63;
            int found = recBS(a, key, 0, a.length - 1);
            if (found > -1) {
                System.out.println("number: " + key + " is found at position: " + found);
            } else {
                System.out.println("not found");
            }
        }

        public static int recBS(int[] a,int key,int left, int right) {
            int mid;
            if (right < left)
                return -1;
            mid = (left + right) / 2;
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                return recBS(a,key,mid+1,right);
            else
                return recBS(a,key,left,mid-1);
        }
}
