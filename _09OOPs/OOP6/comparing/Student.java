package _09OOPs.OOP6.comparing;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;
    Student(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return marks + "";
    }
}