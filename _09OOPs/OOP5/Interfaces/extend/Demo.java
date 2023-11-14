package _09OOPs.OOP5.Interfaces.extend;

interface A {
    void fun();
}

interface B extends A{
    void greet();
}
public class Demo implements B{

    @Override
    public void fun() {
        System.out.println("a stupid function");
    }

    @Override
    public void greet() {
        System.out.println("hello user");
    }
}