package _01basics;
// import java.util.Scanner;

public class Fibonacci {
    static int fun1(int n){
       int a=0;
       int b=1;
       for(int i=2; i <=n; i++){
          int temp = b;
          b = b + a;
          a = temp;
       }
       return b;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a no");
        // int x = sc.nextInt();
        System.out.println(fun1(8));
    }
}
