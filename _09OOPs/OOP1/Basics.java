package _09OOPs.OOP1;

import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
//        Student st1 = new Student();
//        System.out.println(st1.name);

//        Student st2 = new Student("Aditya", 13, 84.5f);
//        System.out.println(st2.name);

//        Student st3 = new Student(st2);
//        System.out.println(st3.name);

        Student st4 = new Student();
        System.out.println(st4.name);
    }
}
// class contains data of students
class Student{
    String name;
    int rollNo;
    float marks;
//    Student(){              // no arg constructor.
//        this.name = "Default";
//        this.rollNo = 1;
//        this.marks = 100.0f;
//    }
    Student(String name, int rollNo, float marks){      // parameterized constructor (with args)
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    Student(Student other){             // this is a copy constructor.
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
    Student(){
        // this is how you call a constructor from another constructor.
        // internally: new Student("Aditya", 139, 70.2f);
        this("Aditya", 139, 70.2f);
    }
}
