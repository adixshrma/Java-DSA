package _02Arrays;

import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[][] arr2 = {{2,4,5},{4,5,6},{9,8,7}};

        for (int i = 0; i < arr1.length; i++) {     // printing via for loop
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i : arr1){                          // printing via for each loop
            System.out.print(i + " ");              // focus here what we are printing
        }
        System.out.println();
        System.out.print(Arrays.toString(arr1));    // printing via Arrays.toString
        System.out.println();

        // for 2D array

        for (int i = 0; i < arr2.length; i++) {     // printing via for loop
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] row : arr2) {                   // printing via for each loop
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(row[j] + " ");    // focus here what we are printing
            }
            System.out.println();
        }

}}
