package _10recursion4;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        subseq("", "abc");

//        ArrayList<String> list = new ArrayList<>();
//        subseq1("", "abc", list);
//        System.out.println(list);

        System.out.println(subseq2("" , "abc"));
    }

    static void subseq(String p, String up){            // it will print all subsequence
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
    static void subseq1(String p, String up, ArrayList<String> list){           // adding to an external arraylist.
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch = up.charAt(0);

        subseq1(p + ch, up.substring(1), list);
        subseq1(p, up.substring(1), list);
    }

    static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p + ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
