package _02Arrays;
import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] num = new int[3][3];
        System.out.println("Enter a matrix 3x3:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num [i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < num.length; i++) {            //printing technique 1
            for (int j = 0; j < num[i].length; j++) {  
               System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] i : num) {                             //using for each loop and Arrays.toString
            System.out.println(Arrays.toString(i));
        }
    } 
}
