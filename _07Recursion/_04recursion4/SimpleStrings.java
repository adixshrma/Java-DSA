package _07Recursion._04recursion4;

public class SimpleStrings {
    public static void main(String[] args) {
//        skip("", "abcdfga");

        String str = "baccad";
        System.out.println(skip(str));

//        String str = "abxdapplebg";
//        System.out.println(skipApple(str));

//        String str = "app can not be apple";
//        System.out.println(skipAppNotApple(str));
    }
    static void skip(String p, String up){          //str processed str unprocessed
        if(up == ""){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String str){
        if(str == ""){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip(str.substring(1));
        }
        else {
            return ch + skip(str.substring(1));
        }
    }
    static String skipApple(String str){
        if(str == ""){
            return "";
        }
        if(str.startsWith("apple")){
            return str.substring(5);
        }
        else {
           return str.charAt(0) + skipApple(str.substring(1));
        }
    }
    static String skipAppNotApple(String str){       // skip app but not apple
        if(str == ""){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return str.substring(3);
        }
        else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
