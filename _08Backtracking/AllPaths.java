package _08Backtracking;

// here we are solving all paths U, D, R, L. which require backtracking.

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPaths("" , maze, 0,0);

        int[][] arr = new int[maze.length][maze[0].length];
        allPathsPrint("", maze,arr,0,0,1);
    }
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // I'm considering this block in my path.
        maze[r][c] = false;

        if(r < maze.length-1){
            allPaths(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length-1){
            allPaths(p + 'R', maze, r, c + 1);
        }
        if(r > 0){
            allPaths(p + 'U', maze, r-1, c);
        }
        if (c > 0) {
            allPaths(p + 'L', maze, r, c-1);
        }
        // this line is where the function will be over.
        // so before the function get removed, also remove the changes that you have made in function call.
        maze[r][c] = true;
    }

    // for printing arrays as well as path.
    static void allPathsPrint(String p, boolean[][] maze, int[][] arr, int r, int c, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            arr[r][c] = step;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // I'm considering this block in my path.
        maze[r][c] = false;
        arr[r][c] = step;

        if(r < maze.length-1){
            allPathsPrint(p + 'D', maze, arr,r + 1, c, step+1);
        }
        if(c < maze[0].length-1){
            allPathsPrint(p + 'R', maze, arr, r, c + 1, step+1);
        }
        if(r > 0){
            allPathsPrint(p + 'U', maze, arr,r-1, c, step+1);
        }
        if (c > 0) {
            allPathsPrint(p + 'L', maze, arr, r, c-1, step+1);
        }
        // this line is where the function will be over.
        // so before the function get removed, also remove the changes that you have made in function call.
        maze[r][c] = true;
        arr[r][c] = 0;
    }
}
