package _02Arrays.searching.binarySearch;

public class LearnBinarySearch {
    public static void main (String [] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch (int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
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
