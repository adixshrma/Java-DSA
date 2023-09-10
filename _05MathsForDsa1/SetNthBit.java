package _05MathsForDsa1;

// we have to set nth bit of given no, if its 0 make it 1, else no change
// eg:- 86 in decimal = 1010110 in binary, its 4th bit is 0, change it to 1.

public class SetNthBit {
    public static void main(String[] args) {
        int num = 86;
        int bit = 4;
        System.out.println(setBit(num, bit));
    }
    static int setBit(int num, int bit){
        int one = 1;
         return (one << (bit -1)) | num;
    }
}
