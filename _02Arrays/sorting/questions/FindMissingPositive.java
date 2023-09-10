package _02Arrays.sorting.questions;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5,6,7};
        System.out.println(missingPositive(nums));
    }
    static int missingPositive(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] -1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap( nums, i , correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if( nums[j] != j +1){
                return j+1;
            }
        }
        return nums.length +1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
