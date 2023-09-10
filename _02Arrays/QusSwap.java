package _02Arrays;
import java.util.*;

public class QusSwap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,48,7};
        swap(arr, 2,6);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }  
}
