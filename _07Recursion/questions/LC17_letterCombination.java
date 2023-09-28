package _07Recursion.questions;
import java.util.ArrayList;

// here we haven't done leetcode problem yet.

public class LC17_letterCombination {      // letter combination of a phone number.
    public static void main(String[] args) {
//        letterCombination("", "12");
        System.out.println(letterCombArray("", "89"));
    }
    static void letterCombination(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';     // this will convert '2' to 2
        for (int i = (digit-1)*3; i < (digit)*3; i++) {
            char ch = (char)('a' + i);
            letterCombination(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> letterCombArray(String p, String up){       // this will return ArrayList
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';     // this will convert '2' to 2

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < (digit)*3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(letterCombArray(p + ch, up.substring(1)));
        }
        return ans;
    }

}
