package _07recursion1;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,8,9,10,12};
        System.out.println(search(arr, 12, 0, 8));
    }
    static int search(int[] arr, int target, int s, int e){
        int m = s + (e -s)/2;
        if(arr[m] == target){
            return m;
        }
        else if(arr[m] < target){
           return search(arr, target, m+1, e);    // s = m + 1;
        }
        return search(arr, target, s, m-1);     // e = m -1;
    }
}
