package _03Strings;

import java.util.Arrays;

public class Strings1 {
    public static void main(String[] args) {
        String name = "Aditya Sharma";
        String name2 = "  Aam Aadmi";
        System.out.println(name.charAt(5));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name2.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
