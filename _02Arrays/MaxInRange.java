package _02Arrays;

import java.util.Scanner;

public class MaxInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 2,8,5,2,3,65,4,8,5,24,545,585,255};
        System.out.println("Enter range or two index no.:");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("max no. in given range is:");
        System.out.println(maxItem(arr, x , y));

    }
    static int maxItem(int[] arr, int start, int end){
        int max = arr[start];
        // if(start<0){
        //     return -1;
        // }
        // else if(end > 12){
        //     return -1;
        // }
        // else if(start > end){
        //     return -1;
        // }
        for (int i = start; i <= end; i++) {
            if( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
