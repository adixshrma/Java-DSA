package _02Arrays.searching.linearSearch;
import java.util.*;

public class LinearSearch {         // this program has some problems
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,9,9,6,4,8,7};
        int start = 0;
        int end = arr.length;
        System.out.println("enter the key:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean b = false;
   
    while (start < end){
         if (arr[start] == x){
            System.out.println("key found at index " + start);
            b = true;
         }
         if (b = false){
            System.out.println("element not found: ");
         }
         start++;
    }
       
    }
}
