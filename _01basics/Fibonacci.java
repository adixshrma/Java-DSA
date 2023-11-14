package _01basics;
// import java.util.Scanner;

public class Fibonacci {
    static int fun1(int n){
        if(n < 2){
            return n;
        }
       int a=0;
       int b=1;
       for(int i=2; i <=n; i++){
          int temp = b;
          b = b + a;
          a = temp;
       }
       return b;
    }
    static void fun2(int n){        // this will print up to nth fibonacci no.
        if(n == 0){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(0 + " " + 1);
        }
        else {
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 0; i < n - 1; i++) {
                int temp = b;
                b = b + a;
                a = temp;
                System.out.print(b + " ");
            }
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a no");
        // int x = sc.nextInt();
        // System.out.println(fun1(3));
        fun2(10);
    }
}
