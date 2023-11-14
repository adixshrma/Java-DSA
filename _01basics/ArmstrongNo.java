package _01basics;

public class ArmstrongNo {
    static boolean isArmstrong(int a){      // three digit armstrong numbers.
        int original = a;
        int sum = 0;
        while(a > 0){
            int rem = a % 10;
            a = a/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter a no:");
        // int a = in.nextInt();
        // System.out.println(isArmstrong(a));
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
}
