package _09OOPs.OOP7.collections;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();     // reference variable of parent class and object of child class.
//        ArrayList<Integer> list = new ArrayList<>();      // another way, same thing.

        List<Integer> list1 = new LinkedList<>();
//        LinkedList<Integer> list = new LinkedList<>();    // same thing.

        list1.add(45);
        list1.add(89);
        list1.add(54);
        System.out.println(list1);

        List<Integer> list2 = new Vector<>();
//        Vector<Integer> list2 = new Vector<>();           // same thing.
        list2.add(78);
        list2.add(67);
        list2.add(45);
        System.out.println(list2);
    }
}
