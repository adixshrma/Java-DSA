package _08recursion2;

public class RotatedBinary {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        int key = 4;
        int s = 0;
        int e = arr.length-1;
        int ans = RBS(arr, key, s,e);
        System.out.println(ans);
    }

    static int RBS(int [] arr, int k, int s, int e){
        int m = (s+e)/2;
        if(s > e){
            return -1;
        }
        if(arr[m] == k){
            return m;
        }
        if(arr[s] < arr[m]){
            if(k >= arr[s] && k <= arr[m]){
                return RBS(arr, k, s, m-1);
            } else{
                return RBS(arr, k, m+1, e);
            }
        }
        else {
            if( k >= arr[m] && k <= arr[e]){
                return RBS(arr, k, m+1, e);
            } else{
                return RBS(arr, k, s, m-1);
            }
        }
    }
}
