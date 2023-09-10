package _02Arrays.sorting.questions;

// Problem on missing no from 0 to N.

public class MissingNo {
    public static void main(String[] args) {
        int [] nums = {5,4,3,1,0};
        int ans = cyclic(nums);
        System.out.println(ans);
    }
    static int cyclic(int [] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] < arr.length && arr[i] != i){     // if a no. is missing, there must be a no. equal to arr.length(exclude it)
                swap(arr, i, arr[i]);
            } else{
                i++;
            }
        }
        for (int j = 0; j < arr.length;) {
            if(arr[j] == j){
               j++;
            }
            else{
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
