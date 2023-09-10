package _02Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysLearn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Entered array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] + " ");
        }
        System.out.println();
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println("Enter 4 strings:");
        // String [] str = new String[4];
        // for (int i = 0; i < str.length; i++) {
        //     str[i] = in.next();
        // }
        // System.out.println(Arrays.toString(str));

    }
}
