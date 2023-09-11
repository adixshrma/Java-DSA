package _07Recursion._02recursion2;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,10};
        boolean ans = sortedAsc(arr, 0);
        System.out.println(ans);
        System.out.println(sorted(arr, 0));
    }
    static boolean sortedAsc(int[] arr, int index) {               // My method
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return sortedAsc(arr, index+1);
        }
        return false;
    }

    static boolean sorted(int[] arr, int index){        // Kunal's method
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index +1] && sorted(arr, index +1);
    }
}
