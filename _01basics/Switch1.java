package _01basics;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a fruit:"); 
       String name = in.nextLine() ;
       
       switch (name){
        case "mango"-> System.out.println("king of fruits");
        case "apple"-> System.out.println("red healthy fruit:");
        case "bananna"-> System.out.println("gymbro's favourite:");
        default -> System.out.println("Enter a valid fruit:");

       }
    }
}
