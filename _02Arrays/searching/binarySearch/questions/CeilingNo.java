package _02Arrays.searching.binarySearch.questions;

public class CeilingNo {
    public static void main (String [] args){
         int arr[] = {1,2,3,4,9,10,12,13,14,16,19};
         int target = 9;
         System.out.println(ceiling(arr, target));
    }
    static int ceiling(int[] arr , int key){
        int start = 0;
        int end = arr.length - 1;
        if (key > arr[arr.length - 1]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if ( key > arr[mid] ){
                start = mid + 1;
            }
            else if ( key < arr[mid]){
                end = mid - 1;
            }
            else 
               return mid;
        }
        return start;
    }

}
