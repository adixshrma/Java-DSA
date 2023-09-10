package _02Arrays.searching.binarySearch.questions;

// this program will work for both rotated and non rotated array.

public class SearchRotatedArr {
    public static void main(String[] args) {
        //int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = {10,11,13,15,1,2,4,5,6,7,8,9};
        int target = 15;
        System.out.println(searchElement(arr, target));
        //System.out.println(searchElement(arr, target));
    }
    static int searchElement(int [] arr, int target){
        int start = 0;
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, start, arr.length-1);
        }
        int FirstTry = binarySearch(arr, target, start, pivot);
        if(FirstTry != -1){
            return FirstTry;
        }
        else {
            return binarySearch(arr, target, pivot, arr.length-1);
        }
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
    static int binarySearch (int[] arr, int key, int start, int end){
    
        while(start <= end){
            int mid = start + (end - start)/2;
    
                if( key > arr[mid]){
                    start = mid + 1;
                }
                else if ( key < arr[mid]){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            
           
        }
        return -1;
    }
}
