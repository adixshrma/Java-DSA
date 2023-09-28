package _08Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] maze = new boolean[n][n];
        System.out.println(nQueen(maze, 0));
    }

    static int nQueen(boolean[][] maze, int r){
        if(r == maze.length){
            display(maze);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < maze.length; col++) {
            // if it is safe then place the queen here.
            if(isSafe(maze, r, col)){
                maze[r][col] = true;            // queen is placed.
                count += nQueen(maze, r +1);    // now check for rows downside.
                maze[r][col] = false;           // function is over, revert the changes ( backtracking )
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] maze, int r, int col) {
        // for vertical
        for (int i = 0; i < r; i++) {
            if(maze[i][col]){
                return false;
            }
        }
        // for left diagonal
        int maxLeft = Math.min(r, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(maze[r - i][col - i]){
                return false;
            }
        }
        // for right diagonal
        int maxRight = Math.min(r, maze.length - col -1);
        for (int i = 1; i <= maxRight; i++) {
            if(maze[r-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] maze) {
        for(boolean[] row : maze){
            for(boolean element: row){
                if(element){      // it means queen is there.
                    System.out.print("Q ");
                }
                else{
                    System.out.print("- ");   // queen is not present.
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
