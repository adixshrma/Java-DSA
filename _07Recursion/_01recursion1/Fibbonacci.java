package _07Recursion._01recursion1;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fiboNo(7));
        
    }
    static int fiboNo(int n){
        if(n < 2){
            return n;
        }
        return fiboNo(n-1) + fiboNo(n-2);
    }
    
}
