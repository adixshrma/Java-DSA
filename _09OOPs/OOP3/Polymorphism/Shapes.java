package _09OOPs.OOP3.Polymorphism;

public class Shapes {
    // If we make this final, it cant be overridden.
//    final void area(){
//        System.out.println("I am in Shapes.");
//    }
    void area(){
        System.out.println("I am in Shapes.");
    }
}
class Circle extends Shapes{
    // this will return when object of Circle is created.
    // hence it's overriding the parent's method.
    @Override       // this is called annotation, it will check overriding is occurring or not.
    void area(){
        System.out.println("pie * r * r");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("a * a");
    }
}