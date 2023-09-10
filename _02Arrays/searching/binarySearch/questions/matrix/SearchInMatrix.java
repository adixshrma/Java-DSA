package _02Arrays.searching.binarySearch.questions.matrix;

import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{10,20,30,40},
                           {11,22,33,44},
                           {13,24,37,48},
                           {15,26,39,50}};
        int target = 50;
        System.out.println(Arrays.toString(searchM(matrix, target)));
    }
    static int[] searchM(int [][] arr, int target){
        int r = 0;
        int c = arr.length -1;
        while ( r < arr.length && c >=0){
            if( arr[r][c] == target){
               return new int[]{r, c};
            }
            else if( arr[r][c] > target){
                c--;
            }
            else {
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
