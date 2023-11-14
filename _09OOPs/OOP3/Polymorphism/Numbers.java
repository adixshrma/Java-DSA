package _09OOPs.OOP3.Polymorphism;

// it shows method overloading.

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int... num){    // values will store as an array for eg {4,5,6,3,2,1,7}
        int ans = 0;
        for(int i : num){
            ans = ans + i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(4,5,6,3,2,1,7));
    }
}
