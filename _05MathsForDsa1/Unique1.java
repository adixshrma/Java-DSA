package _05MathsForDsa1;

// find a number which is not repeating itself.

public class Unique1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,3,6,4,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for( int i : arr){
            unique = unique ^ i;
        }
        return unique;
    }
}
