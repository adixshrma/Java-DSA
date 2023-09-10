package _01basics;
import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ans = 0;

        while(true){
            System.out.println("enter operator = 'x' to exit the program:");
            System.out.println("enter no 1:");
            int a = sc.nextInt();
            System.out.println("enter operator:");
            char ch = sc.next().charAt(0);
            System.out.println("enter no 2:");
            int b = sc.nextInt();
          if( ch == '+'|| ch == '-'|| ch == '*'|| ch == '/'|| ch == 'x'){
            if (ch == '+') {
                ans = a + b;
            }
            if (ch == '-'){
                ans = a - b;
            }
            if (ch == '*'){
                ans = a*b;
            }
            if (ch == '/' ){
                if (b != 0) {
                    ans = a/b;
                }
                else
                System.out.println("divide by zero error:");
                break;
            }
            if (ch == 'x') {
                break;
            }
            System.out.println(ans);
        }
            else{
            System.out.println("invalid operator:");
            }
           
        }
    }
    
  }

