// Program to reverse a number

package _01basics;

public class QueReverseNo {
    public static void main(String[] args) {
        int n = 123456;
        int res = 0;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            res = res * 10 + rem;
        }
        System.out.println(res);
    }
}
