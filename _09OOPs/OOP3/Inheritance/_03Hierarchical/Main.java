package _09OOPs.OOP3.Inheritance._03Hierarchical;

class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}
public class Main{
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.eat();
        obj1.bark();
//        obj1.meow();      // compile time error

        Cat obj2 = new Cat();
        obj2.eat();
        obj2.meow();
//        obj2.bark();        // compile time error
    }
}