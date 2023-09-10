package _07recursion1;

// no of steps to reduce a number to zero LeetCode 1342.


public class LC1342_NoOfSteps {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    static int steps(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int s){
        if (n == 0){
            return s;
        }
        if( (n & 1) == 1){      // number is odd
            return helper(n-1, s+1);
        }
        return helper(n/2, s+1);
    }
}
