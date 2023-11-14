package _09OOPs.OOP2;

import java.util.HashMap;

public class File1 {
    public static void main(String[] args) {
//        Human aditya = new Human(22, "aditya", false);
//        Human aman = new Human(20, "aman", false);
        System.out.println(Human.population);
    }
}
class Human {
    int age;
    String name;
    boolean married;
    static long population;
    Human(int age, String name, boolean married){
        this.age = age;
        this.name = name;
        this.married = married;
        population += 1;
    }
}