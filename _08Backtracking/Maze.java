package _08Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(countWays(3,3));

//        printWays("", 3, 3);

//        System.out.println(retWays("", 3,3));

//        System.out.println(retPathDiagonal("", 3, 3));

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathWithObstacles("", maze, 0,0);
    }
    static int countWays(int r, int c){     // here we are counting no. of ways to reach last square.
        if( r==1 || c==1){
            return 1;
        }
        int left = countWays(r-1, c);
        int right = countWays(r, c-1);

        return left + right;
    }
    static void printWays(String p, int r, int c){      // here we are printing ways or path.
        if (r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if(r>1) {
            printWays(p + 'D', r - 1, c);
        }
        if(c>1){
            printWays(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> retWays(String p, int r, int c){       // here we are returning paths in ArrayList.
        if (r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(retWays(p + 'D', r-1, c));
        }
        if(c>1){
            ans.addAll(retWays(p + 'R', r, c-1));
        }
        return ans;
    }

    static ArrayList<String> retPathDiagonal(String p, int r, int c){       // here we are considering diagonal too.
        if (r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(retPathDiagonal(p + 'D', r-1, c));
        }
        if(c>1){
            ans.addAll(retPathDiagonal(p + 'R', r, c-1));
        }
        if(r>1 && c>1){
            ans.addAll(retPathDiagonal(p + 'd', r-1, c-1));
        }
        return ans;
    }

    static void pathWithObstacles(String p, boolean[][] maze, int r, int c){        // here we have obstacles too.
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }
        if(r < maze.length-1){
            pathWithObstacles(p + 'D', maze,r + 1, c);
        }
        if(c < maze[0].length-1){
            pathWithObstacles(p + 'R', maze, r, c + 1);
        }
    }
}
