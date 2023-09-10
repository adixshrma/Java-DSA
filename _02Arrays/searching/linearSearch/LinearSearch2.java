package _02Arrays.searching.linearSearch;

public class LinearSearch2 {
    public static void main(String[] args) {
        int [] arrr = {1,2,3,6,5,4,7,8,9,15,23};
        int key = 15;
        int ans = linearSearch(arrr, key);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
