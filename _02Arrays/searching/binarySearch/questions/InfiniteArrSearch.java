package _02Arrays.searching.binarySearch.questions;

public class InfiniteArrSearch {
    public static void main (String [] args){
        int[] arr = {1,2,3,5,6,8,9,10,12,13,15,16,17,19,21,22,24,26,27,29,30};
        int target = 17;
        System.out.println(ans(arr, target));
    }
    static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newS = end + 1;
            end = end + (end - start + 1)*2;
            start = newS;    
        }
        return binarySearch(arr, target, start, end);
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
