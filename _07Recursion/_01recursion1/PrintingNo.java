package _07Recursion._01recursion1;

public class PrintingNo {
    public static void main(String[] args) {
        printRev(10);
        System.out.println();
        print(10);
        System.out.println();
        printBoth(10);
    }
    static void printRev (int n){
        if (n==0){
            return;
        }
        else {
            System.out.print(n + " ");
            printRev(n-1);
        }
    }
    static void print(int n){
        if (n == 0){
            return;
        } else{
            print(n-1);                     // this is called tail recursion
            System.out.print(n + " ");
        }
    }


    static void printBoth(int n){
        if (n == 0){
            return;
        } else{
            System.out.print(n + " ");
            printBoth(n-1);
            System.out.print(n + " ");
        }
    }
}
