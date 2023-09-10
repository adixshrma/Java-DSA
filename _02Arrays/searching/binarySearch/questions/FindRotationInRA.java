package _02Arrays.searching.binarySearch.questions;

public class FindRotationInRA {
    public static void main(String[] args) {
        int[] arr = {10,11,12,14,0,1,2,5,7,9};
        // int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(noOfRotation(arr));
    }
    static int noOfRotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot(int arr[]){  // this will return the index of pivot/max element.
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;   //mid is pivot element.
            }
            else if(arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            else if (arr[start] > arr[mid]){
                end = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return -1;
    }
}