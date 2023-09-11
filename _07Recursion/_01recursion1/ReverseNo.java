package _07Recursion._01recursion1;

public class ReverseNo {
    public static void main(String[] args) {
        int num = 1432;
        System.out.println(reverseNo(num));
        System.out.println(reverseRec(num));
    }
    static int reverseNo (int num){         // this is easy to understand
        int ans = 0;                        // use iteration method
        while(num != 0){
            int digit = num % 10;
            ans = ans * 10 + digit;
            num = num/10;
        }
        return ans;
    }
    static int reverseRec(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        int ans = rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
        return ans;
    }
}
