package _03Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        if(str == null || str.length()==0){
            return true;
        }
        while(i <= j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
