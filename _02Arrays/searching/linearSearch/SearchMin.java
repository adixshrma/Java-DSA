package _02Arrays.searching.linearSearch;

public class SearchMin {
    public static void main(String[] args) {
        int [] arr = {1,5,2,3,6,-97,7,4,1,12,74};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int [] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
            min = arr[i];
            }
        }
        return min;
    }
}
