package _02Arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,0,6,9,4,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i< arr.length; i++){
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
                // if array is not swapped for i=0 it means array is already sorted
                // which means no need to check further
                if(!swapped){
                    break;
                }
        }
    }
}
