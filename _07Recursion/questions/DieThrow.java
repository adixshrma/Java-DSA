package _07Recursion.questions;
import java.util.ArrayList;
public class DieThrow {
    public static void main(String[] args) {
//        diceThrow("", 4);
//        System.out.println(diceString("", 4));
        System.out.println(diceFace("", 7, 8));
    }
    static void diceThrow(String p, int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceThrow(p + i, target-i);
        }
    }

    static ArrayList<String> diceString(String p, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            ans.addAll(diceString(p + i, target-i ));
        }
        return ans;
    }

    static ArrayList<String> diceFace(String p, int target, int face){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i<=target; i++) {
            ans.addAll(diceFace(p + i, target-i, face ));
        }
        return ans;
    }
}
