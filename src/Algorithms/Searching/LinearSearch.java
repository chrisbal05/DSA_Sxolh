package Algorithms.Searching;

public class LinearSearch {
    public static void main(String args[]){
        int[] a= {11,9,3,24,8,2,56,1};
        int key = 2;
        System.out.println("number "+key+" is at position:" +LSearch(a,key));
    }
    public static int LSearch(int[] array, int key){
        for(int i=0;i<array.length;i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}


