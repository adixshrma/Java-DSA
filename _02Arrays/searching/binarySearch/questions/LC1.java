package _02Arrays.searching.binarySearch.questions;

public class LC1 {
    public static void main (String [] args){
        char [] alpha = {'a', 'b', 'c', 'f', 'i'};
        char target = 'd';
        char ans = ceiling(alpha, target);
        System.out.println(ans);
    }
    static char ceiling(char[] arr , char key){
        int start = 0;
        int end = arr.length - 1;
       
        while (start <= end){
            int mid = start + (end - start)/2;
            if ( key < arr[mid] ){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            
        }
        return arr[start % arr.length];
    }
}
