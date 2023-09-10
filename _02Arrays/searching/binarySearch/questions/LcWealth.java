package _02Arrays.searching.binarySearch.questions;

public class LcWealth {
   public static void main(String[] args) {
      int[][] arr = { {1,2,33}, {4,5,3}, {11,8,2} };
      System.out.println(maxWealth(arr));
   }
   static int maxWealth (int[][] arr){
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        int rowSum = 0;
        for (int j = 0; j < arr[i].length; j++) {
            rowSum = rowSum + arr[i][j];
        }
        if (rowSum > max){
            max = rowSum;
        }
      }
      return max;
   }

}
