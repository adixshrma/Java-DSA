package _09OOPs.OOP6.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student rahul = new Student(35, 89.9f);
        Student vikas = new Student(36, 92.5f);
        Student ajay = new Student(3, 80.9f);
        Student rohit = new Student(2, 97.5f);
        Student sharma = new Student(5, 69.9f);
        Student verma = new Student(7, 72.5f);

        Student[] arr = {rahul, vikas, ajay, rohit, sharma, verma};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
