package _06MathsForDsa2;
import java.util.ArrayList;

public class FactorsOfNo {
    public static void main(String[] args) {
        int a = 36;
        factors3(a);
    }
    static void factors1(int n){
        for (int i = 1; i <= n ; i++) {
            if ( n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    static void factors2( int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
    static void factors3( int n){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n / i == i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print( i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}