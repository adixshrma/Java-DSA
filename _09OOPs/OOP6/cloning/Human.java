package _09OOPs.OOP6.cloning;

import java.util.Arrays;

public class Human implements Cloneable{
    String name;
    int age;
    int[] arr;
    Human(String name, int age){
        this.name = name;
        this.age = age;
        this.arr = new int[] {5,4,3,2,1};
    }
//    public Object clone() throws CloneNotSupportedException{    // this is shallow copy.
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{    // this is deep copy.
        Human twin = (Human)super.clone();  // this is actually a shallow copy.

        // making a deep copy.
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aditya = new Human("Aditya" , 22);
        Human twin = (Human)aditya.clone();

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(aditya.arr));
    }
}