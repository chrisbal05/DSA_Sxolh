package Algorithms.Searching;

// Checks if i == target or i>target for sorted arrays
public class LinearSearch2 {
    public static void main(String args[]){
        int[] a= {1,2,3,8,9,11,24,56};
        int key = 2;
        System.out.println("number "+key+" is at position:" +LSearch2(a,key));
    }
    public static int LSearch2(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
            if (array[i] > key)
                return -1;
        }
        return -1;
    }
}
