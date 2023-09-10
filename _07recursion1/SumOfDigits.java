package _07recursion1;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 14302;
//        System.out.println(sum(num));
//        System.out.println(sumRec(num));
//        System.out.println(productDigits(num));

        System.out.println(countZeros(2030104));
    }
    static int sum(int num){
        int ans = 0;
        while(num != 0){
            int digit = num % 10;
            num = num /10;
            ans = ans + digit;
        }
        return ans;
    }
    static int sumRec(int num){
        if (num == 0){
            return 0;
        }
        return (num%10) + sumRec(num/10);
    }
    static int productDigits(int num){
        if(num % 10 == num){
            return num;
        }
        return (num % 10) * productDigits(num/10);
    }

    static int countZeros(int num){
        return helper(num , 0);
    }
    private static int helper(int n, int c){
        if(n == 0){
            return c;                          // count c is returned every single time.
        }
        int rem = n % 10;
        if (rem == 0){
            return helper(n/10, c +1);
        }
        else return helper(n/10, c);
    }
}
