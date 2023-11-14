package _09OOPs.OOP5.Interfaces.nested;

public class A {
    interface Nested{
        boolean isOdd(int num);
    }
}
class B implements A.Nested{
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }

}
class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(56));
    }
}
