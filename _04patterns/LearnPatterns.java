package _04patterns;

public class LearnPatterns {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern1(int n){        // square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){        // triangle with no spaces in beginning
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){        // inverted triangle with no spaces
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){        // triangle, print numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){        // triangle + inverted triangle downside, no spaces
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5B(int n){       // pattern5 without using two outer for loops
        for (int i = 1; i < 2*n; i++) {
            int noOfStars = 0;          // there is a better way to use this if-else condition
            if(i <= n){                     // initialise noOfStars like this
                noOfStars = i;              //  int noOfStars = i <= n ? i: 2*n-i
            } else {
                noOfStars = 2*n -i;
            }
            for (int j = 1; j <= noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern6(int n){        // triangle with spaces in beginning
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {    //for spaces
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i; j++) {      // for *
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){           // inverted triangle with spaces
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");      // for spaces
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");     // for * and single space
            }
            System.out.println();
        }
    }
    static void pattern8(int n){            // diamond 123
        for (int i = 1; i < 2*n; i++) {
            int noOfStars = i <= n? i: 2*n -i;
            int noOfSpaces = n - noOfStars;
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= noOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){            // diamond 135
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {     // reverse loop for ease, i am unable to find other possibilities
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < 2*i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){       // triangle with spaces and numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(" "+j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    
    
}
