package _02Arrays.searching.binarySearch.questions;

public class MountainArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8,9,7,6,4,3,2,1};
        System.out.println(peakInMountain(arr));

    }
    static int peakInMountain(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start != end){         // condition (start < end) can also be used, output will remain same.
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
    }
    return arr[start];  
  }
}
