package _09OOPs.OOP3.Encapsulation;

class Person{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(22);
        obj.setName("Aditya");
        System.out.println("name is " + obj.getName());
        System.out.println("age is " + obj.getAge());
    }
}
