package _02Arrays;

import java.util.Scanner;

public class QusMaxItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int [10];
        System.out.println("enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("largest no. is:");
        System.out.println(maxItem(arr));
    }
    static int maxItem(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
