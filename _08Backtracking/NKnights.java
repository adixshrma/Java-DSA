package _08Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] maze = new boolean[n][n];
        nKnights(maze, 0, 0, n);
    }
    static void nKnights(boolean[][] maze, int r, int c, int n){
        if(n == 0){
            display(maze);
            System.out.println();
            return;
        }
        if(r == maze.length -1 && c == maze.length){
            return;
        }
        if(c == maze.length){
            nKnights(maze, r+1, 0, n);
            return;
        }
        if(isSafe(maze, r, c)){
            maze[r][c] = true;                  // Knight is placed.
            nKnights(maze, r, c+1, n-1);
            maze[r][c] = false;
        }
        nKnights(maze, r, c+1, n);
    }

    private static boolean isSafe(boolean[][] maze, int r, int c) {
        if(isValid(maze, r-2, c-1)){
            if(maze[r-2][c-1]){
                return false;
            }
        }
        if(isValid(maze, r-2, c+1)){
            if(maze[r-2][c+1]){
                return false;
            }
        }
        if(isValid(maze, r-1, c-2)){
            if(maze[r-1][c-2]){
                return false;
            }
        }
        if(isValid(maze, r-1, c+2)){
            if(maze[r-1][c+2]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] maze, int r, int c) {
        if(r >= 0 && r < maze.length && c >= 0 && c < maze.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] maze) {
        for (boolean[] row : maze){
            for( boolean element : row){
                if(element){
                    System.out.print("k ");       // queen is placed.
                }
                else{
                    System.out.print("- ");       // queen is not placed or empty.
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
