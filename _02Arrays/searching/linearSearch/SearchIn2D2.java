package _02Arrays.searching.linearSearch;
import java.util.Arrays;

public class SearchIn2D2 {
    public static void main(String[] args) {
        int [][] arr = { {1,2,5,8},
                         {12,36,4,85},
                        { 9,6,78,96}};
        int key = 8;
        int[] ans = search(arr, key);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j]) {
                    return new int[]{i,j};
                }
            }
        }
        return new int [] {-1, -1};
    }
}
