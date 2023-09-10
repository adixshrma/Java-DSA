package _02Arrays.searching.linearSearch;

public class SearchIn2d {
    public static void main(String[] args) {
        int [][] arr = { {1,2,5,8},
                         {12,36,4,85},
                        { 9,6,78,96}};
        int key = 788;
        search2d(arr, key);
        System.out.println();
    }
    static void search2d(int [][] arr, int target){
        int a = 0;
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println("the element is at index: " + "row = " + i + " coloumn = "+ j);
                    a = 1;
                }
            }
         }
         if (a == 0) {
            System.out.println("element does not found:");   
         }
    }
}
