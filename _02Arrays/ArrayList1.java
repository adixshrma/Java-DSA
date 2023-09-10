package _02Arrays;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
   
    ArrayList <Integer> list = new ArrayList<>(10);
    // list.add(45);                               //we can add as many as we want
    // list.add(56);
    // list.add(74);
   
    // list.set(0, 99);
    // list.remove(2);
    // System.out.println(list);
    

    Scanner in = new Scanner(System.in);
    System.out.println("Enter any no of integers:");
    for (int i = 0; i < 5; i++) {
      list.add(in.nextInt());
    }
    System.out.println("given elements are:");
    for (int i = 0; i < 5; i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println(list);
  }
}
