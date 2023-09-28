package _08Backtracking;

public class LC37_SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,0,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        if(Sudoku(board)){
            display(board);
        } else{
            System.out.println("cannot be solved");
        }
    }
    static boolean Sudoku(int[][] board){
        int n = board.length;
        int row = -1;       // index
        int col = -1;       // index

        boolean emptyLeft = false;           // We are assuming that there is no empty element.

        // here we are finding empty elements.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0){       // 0 means empty.
                    row = i;
                    col = j;                // we have found the empty index, giving it to row and col.
                    emptyLeft = true;       // we have found the empty element.
                    break;                  // coming out of this loop, cuz there is no need to check further.
                }
            }
            if(emptyLeft){
                break;      // coming out of loop, cuz there is no need to check.
            }
        }
        if(!emptyLeft){
            return true;        // sudoku is solved. because empty elements are not left.
        }

        // putting elements in place.
        for (int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)){        // if it is safe. (no same element is present in row, col, 3x3)
                board[row][col] = number;               // putting the number there.
                if(Sudoku(board)){                      // if its giving true, sudoku solved, no empty box left.
                    // found the ans
                    return true;
                } else{
                    board[row][col] = 0;        // backtracking.
                }
            }
        }
        return false;           // sudoku cant be solved.
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int r, int c, int num){
        // checking for rows
        for (int i = 0; i < board.length; i++) {
            if(board[r][i] == num){
                return false;
            }
        }
        // checking for columns.
        for (int i = 0; i < board.length; i++) {
            if(board[i][c] == num){
                return false;
            }
        }
        // checking for 3x3 box.
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = r - (r % sqrt);
        int colStart = c - (c % sqrt);
        for (int i = rowStart; i < rowStart + sqrt; i++) {          // i for rows
            for (int j = colStart; j < colStart + sqrt; j++) {      // j for cols
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
