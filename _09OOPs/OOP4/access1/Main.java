package _09OOPs.OOP4.access1;

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
//        obj1.a = 54;      // we can't even access it by making an object of it's class.
        obj1.setA(54);       //  we can access it via setter.


        Child obj2 = new Child();
        obj2.b = 1;
        obj2.c = 2;
        obj2.d = 3;
        // here b, c and d can be accessed because they can be accessed in same package.
    }
}
