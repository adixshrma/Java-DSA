package _02Arrays.sorting;

import java.util.Arrays;

// this will give correct ans when duplicates are there...

public class CyclicSort2 {
    public static void main(String[] args) {
        int [] nums = {10,9,8,7,6,5,4,3,2,1};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclic(int [] arr){
        int i = 0;
        while( i< arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){         // this is a better approach
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
