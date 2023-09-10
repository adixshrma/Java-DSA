package _05MathsForDsa1;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 128;
//        int count = 0;
//        while (n > 0){
//            int last = n & 1;
//            if (last == 1){
//                count++;
//            }
//            n = n>>1;
//        }
//        if (count == 1){
//            System.out.println("power of 2");
//        } else System.out.println("not a power of 2");

        boolean ans = (n & (n-1)) == 0; // fix for n = 0;
        System.out.println(ans);
    }
}
