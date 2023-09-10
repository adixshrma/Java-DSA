package _01basics;

public class Factorial {
    static int fact (int a){
       int res = 1;
        for(int i=2 ; i<=a; i++){
           res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
       System.out.println(fact(5));
    }
}
