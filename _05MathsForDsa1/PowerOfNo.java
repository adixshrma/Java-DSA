package _05MathsForDsa1;

public class PowerOfNo {
    public static void main(String[] args) {
        int base = 3;
        int power = 5;
        int ans = 1;
        while (power > 0){
            int last =  power & 1;
           if(last == 1){
               ans = ans * base;
           }
            power = power >> 1;
            base = base * base;
        }
        System.out.println(ans);
    }
}
