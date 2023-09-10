// Finding the occurrance of a number

package _01basics;

public class QueCountNo {
    public static void main(String[] args) {
    int n = 123745787;
    int count = 0;
    while(n > 0){
        int rem = n % 10;
        if (rem == 7){
            count++;
        }
        n = n/10;
    }
    System.out.println(count);
}
}
