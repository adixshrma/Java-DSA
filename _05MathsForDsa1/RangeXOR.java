package _05MathsForDsa1;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        System.out.println(findRangeXOR(a, b));
    }
    static int findRangeXOR(int a, int b){
        return findXOR(b) ^ findXOR(a-1);
    }
    static int findXOR(int a){
        if(a % 4 == 0){
            return a;
        } else if(a % 4 == 1){
            return 1;
        } else if (a % 4 == 2){
            return a+1;
        } else {
            return 0;
        }
    }
}
