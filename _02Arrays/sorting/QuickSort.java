package _02Arrays.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,9};
        qSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

/*
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));             // these are internal sorting algorithms
*/
    }
    static void qSort(int[] arr, int low, int high){
        if(high <= low){
            return;
        }
        int s = low;
        int e = high;
        int pivot = (s+e)/2;                // here pivot is middle element.

        while(s <= e){
            while(arr[s] < arr[pivot]){     // we will detect the violation of start from this.
                s++;
            }
            while (arr[e] > arr[pivot]){    // we will detect the violation of end from this.
                e--;
            }
            if(s <= e) {
                int temp = arr[s];              // here we will swap both violation, so that it automatically
                arr[s] = arr[e];                // get corrected.
                arr[e] = temp;
                s++;
                e--;
            }

            qSort(arr, low, e);             // this will solve one portion of array.
            qSort(arr, s, high);            // this will solve other portion of array.
        }

    }

}
