package _02Arrays;
import java.util.*;

public class MultArrayList {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     ArrayList <ArrayList<Integer>> list = new ArrayList<>();
    
     for (int i = 0; i < 3; i++) {
        list.add(new ArrayList<>());     //initialisation
     }
     System.out.println("add elements:");
     for (int i = 0; i < 3; i++) {
        for ( int j = 0; j < 3; j++) {         //adding elements
            list.get(i).add(in.nextInt());
        }
     }
     System.out.println("given elements are:");
     System.out.println(list);

   }

}
