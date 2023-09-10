package _05MathsForDsa1;

public class NoOfSetBits {
    // this is brut force method OR low efficient...

//    public static void main(String[] args) {
//        int num = 45;
//        int count = 0;
//        while (num > 0){
//            int last = num & 1;
//            if (last == 1){
//                count++;
//            }
//            num = num >> 1;
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args) {
        int num = 1023;
        System.out.println(Integer.toBinaryString(num));
        int count = 0;
        while (num > 0){
            // num = num - (num & (-num));

            num = num & (num - 1);
            count ++;
        }
        System.out.println(count);
    }
}
