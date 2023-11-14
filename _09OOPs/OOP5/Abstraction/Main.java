package _09OOPs.OOP5.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son obj1 = new Son(25);
        obj1.career();
        obj1.marry();

        Daughter obj2 = new Daughter(22);
        obj2.career();
        obj2.marry();
        System.out.println(obj2.age);

        Parent.print();
        obj1.print2();
        obj2.print2();


    }
}
