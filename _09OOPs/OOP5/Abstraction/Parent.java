package _09OOPs.OOP5.Abstraction;

public abstract class Parent {
    int age;
    final int VALUE;
    Parent(int age){
        this.age = age;
        VALUE = 100;
    }
    abstract void career();
    abstract void marry();
    static void print(){
        System.out.println("i am in parent class");
    }
    void print2(){
        System.out.println("it is abstract class");
    }

}
class Son extends Parent{
    Son(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I want to a coder.");
    }
    @Override
    void marry(){
        System.out.println("I want to marry Anjali");
    }
}

class Daughter extends Parent{
    Daughter(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I want to become a teacher");
    }

    @Override
    void marry() {
        System.out.println("I want to marry Aditya");
    }

    @Override
    void print2() {
        System.out.println("from parent to daughter");
    }

}