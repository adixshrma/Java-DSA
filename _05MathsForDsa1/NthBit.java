package _05MathsForDsa1;

// we have to find nth bit of a given no.
// example- binary number 1100110 's 3rd bit is 1 and 4th bit is 0. 

public class NthBit {
    public static void main(String[] args) {
        int a = 100;
        int bit = 3;
        System.out.println(nthBit(a, bit));
    }
    static int nthBit(int num, int bit){
       return (( num >> (bit -1)) & 1 );
    }
}
