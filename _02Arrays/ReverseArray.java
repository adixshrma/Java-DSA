package _02Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {45,25,36,95,8,7,96,325,856,85,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr){
        int start = 0;
        int end = arr.length - 1;
       
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
    }
}
