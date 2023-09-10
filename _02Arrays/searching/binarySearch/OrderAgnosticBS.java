package _02Arrays.searching.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {14,13,12,10,9,8,6,5,3,2,1};
        int key = 10;
        int ans = binarySearch(arr, key);
        System.out.println(ans);
    }
    static int binarySearch (int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
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
}
