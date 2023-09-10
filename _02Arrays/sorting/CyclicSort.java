package _02Arrays.sorting;

import java.util.Arrays;

// this was done by me first time, its not better one.

public class CyclicSort {
    public static void main(String[] args) {
        int [] nums = {10,9,8,7,6,5,4,3,2,1};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclic(int [] arr){
        for (int i = 0; i < arr.length;) {
            if( arr[i] == i + 1){
                i++;
            } else {
                swap(arr, i, arr[i] -1);
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
