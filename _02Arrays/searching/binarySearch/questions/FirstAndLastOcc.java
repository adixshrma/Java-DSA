package _02Arrays.searching.binarySearch.questions;

import java.util.Arrays;

public class FirstAndLastOcc {   
    public static void main (String [] args){
        int[] arr = {5,7,7,7,7,8,8,10};
        int key = 7;
        System.out.println(Arrays.toString(firstAndLast(arr, key)));
        
    }
    static int[] firstAndLast(int [] arr, int key){
        int[] ans = {-1,-1};
        ans[0] = search(arr, key, true);
        if (arr[0]!= -1){
        ans[1] = search(arr, key, false);
        }
        return ans;
    }
    static int search(int[] arr, int key, boolean firstIndex){
        int ans = -1;

        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + ( end - start)/2;
            if (key < arr[mid]){
                end = mid -1;
            }
            else if (key > arr[mid]){
                start = mid +1;
            }
            else {
               ans = mid;
               if (firstIndex){
                 end = mid -1;
               }
               else {
                start = mid +1;
               }
            }
        }
        return ans;
    }
}
