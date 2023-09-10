package _06MathsForDsa2;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.print( sqrt(40));
    }
    static double sqrt( double n){
        double x = n;
        double root;
        while(true){
            root = (x + n/x) * 0.5;
            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }

}
