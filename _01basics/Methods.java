package _01basics;

public class Methods {
    static int add(int a, int b){
        return a + b;
    }
    static int add(int ...arr){
        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }
    public static void main(String[] args) {
        int num = add(4,5);
        System.out.println(num);
        System.out.println(add(4,5,6,8));
    }
}
