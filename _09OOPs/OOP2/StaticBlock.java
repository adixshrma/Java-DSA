package _09OOPs.OOP2;

public class StaticBlock {
    static int a = 5;
    static int b;

    static{     // this is a static block. It only executes once.
        System.out.println("I am in static block");
        b = 4 * 5;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
        a = 50;
        System.out.println(a);
    }
}
