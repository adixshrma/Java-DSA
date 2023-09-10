package _02Arrays.sorting.questions;

import java.util.Arrays;

// In this program we have to return duplicate no. and the num which is missing.

public class FindErrorNums {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(errorNums(nums)));
    }
    static int[] errorNums(int[] nums){
        int i =0;
        while (i< nums.length){
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1){
                return new int[] {nums[j] , j+1};
            }
        }
       return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
