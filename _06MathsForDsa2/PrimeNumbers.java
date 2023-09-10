package _06MathsForDsa2;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(primes(40));
    }
    static ArrayList<Integer> primes(int n){
        ArrayList <Integer> num = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                num.add(i);
            }
        }
        return num;
    }
    static boolean isPrime(int n){
        int c = 2;
        while( c*c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
