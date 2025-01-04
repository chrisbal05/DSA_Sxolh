package Algorithms.Searching;

public class MyBinarySearch1 {
    public static void main (String[] args) {
        int nums[]={1,4,15,27,39,41,57,63};
        int key=41;
        System.out.println("number "+ key + " is found at position: "+
                binarysearch(nums,key));
    }
    public static int binarysearch(int []a, int key){
        int mid, left=0, right=a.length-1;
        int pos = -1;
        boolean flag = false ;
        while (!flag && left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == key){
                pos = mid;
                flag = true;
            }
            else if (key < a[mid])
                right = mid-1;
            else
                left = mid + 1;
        }
        return pos;
    }
}