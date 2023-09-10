package _01basics;
import java.util.*;

public class Prime1 {
    static boolean prime(int a){
        if (a <= 1) {
            return false;
        }
            int c = 2;
            while(c <= Math.sqrt(a)){       // c * c <= a    can also be used.(squaring both side)
               if(a % c == 0){
                return false;
               }
               c++;
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int x = in.nextInt();
        System.out.println(prime(x));
    }
}
