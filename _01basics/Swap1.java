package _01basics;

import java.util.Arrays;

public class Swap1 {
    // static void swap(int a , int b){   // this change is only valid in this function scope
    //    int temp = a;
    //    a = b;
    //    b = temp; 
    // }
    static void change(int[] num){
        num [0] = 33;
    }
    public static void main(String[] args) {
        // int a = 45;
        // int b = 56;
        // swap(a, b);
        // System.out.println(a +" "+ b);   // no swaping
        int [] numbers = {1,2,3,5,6};
        change(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
