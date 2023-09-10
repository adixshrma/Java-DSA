package _02Arrays.searching.linearSearch;

public class MaxIn2D {
    public static void main(String[] args) {
        int [][] arr = { {1,2,5,8},
                         {12,36,4,5},
                        { 9,6,0,6}};
        System.out.println(maxIn2D(arr));               
    }
    static int maxIn2D (int [][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
