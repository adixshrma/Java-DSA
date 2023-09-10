package _02Arrays.searching.binarySearch.questions;

public class LC_CountNegativeInSorted {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
    static int countNegatives(int[][] grid) {
        int count = 0;
        int row = 0;
        int col = grid[0].length -1;
        while(row < grid.length && col >= 0){
            if(grid[row][col] < 0){
                count = count + grid.length - row;
                col--;
            }
            else{
                row++;
            }
        }
        return count;
    }
}
