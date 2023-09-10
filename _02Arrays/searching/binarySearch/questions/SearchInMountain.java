package _02Arrays.searching.binarySearch.questions;

public class SearchInMountain {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,8,6,4,2,0};
        int target = 3;
        //System.out.println(peakInMountain(arr));
        System.out.println(ans(arr, target));
    }
    static int ans(int arr[] , int target){
        int peak = peakInMountain(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr, target, peak+1, arr.length-1);
    }
    static int binarySearch (int[] arr, int key, int start, int end){
    
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if ( key == arr[mid]){
                return mid;
            }
                if(isAsc){
                    if( key > arr[mid]){
                    start = mid + 1;
                    }
                    else if ( key < arr[mid]){
                    end = mid - 1;
                    }
                }
                else {
                    if( key < arr[mid]){
                        start = mid + 1;
                        }
                        else if ( key > arr[mid]){
                        end = mid - 1;
                        }
                }    
        }
        return -1;
    }
    
    static int peakInMountain(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){         // condition (start < end) can also be used, output will remain same.
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
    }
    return start;  
  }
}
