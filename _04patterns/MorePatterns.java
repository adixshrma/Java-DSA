package _04patterns;
import java.lang.Math;

public class MorePatterns {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern1(int n){        // diamond 135 with spaces and numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        int N = 2*n-1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int distance = Math.min(Math.min(i, j), Math.min(N-1-i, N-1-j) );
                int index = n - distance;
                System.out.print(" " +index);
            }
            System.out.println();
        }
    }
}
