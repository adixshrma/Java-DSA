package _02Arrays.searching.binarySearch.questions;

public class LcEvenNoDigitsCount {
    public static void main(String[] args) {
        int[] arr = {-12,0,20,56,96,5,5469}; 
        System.out.println(countDigits(arr));
        
    }
    static boolean even(int num){           // this will find digit contain even no of digits or not
        int count = 0;
        if (num == 0){
            return false;
        }
        if ( num < 0){
            num = num * -1;
        }
        while (num > 0) {
            num = num / 10;
            count ++;
        }
        if ( count % 2 == 0){
            return true;
        }
        return false;
    }
    static int countDigits(int [] arr){      // this will count even no of digits
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])){
               count++;
            }
        }
        return count;
    }
}
