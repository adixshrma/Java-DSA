package _02Arrays.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9,8,4,5,6,2,7,3,1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(findMax(arr, 5));
    }
    static void selection (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;    // its index
            int max = findMax(arr, last);   // its index of max element
            swap(arr, max, last);           // we are swapping last element with max
        }
    }
    static int findMax(int[] arr, int lastIndex){               // it will return index which we needed.
        int max = 0;
        for (int i = 1; i <= lastIndex; i++) {
            if( arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
