package _09OOPs.OOP6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i * 2);
        }
        System.out.println(arr);
//        arr.forEach((item) -> System.out.print(item *2 + " "));     // this is inline function

//        Consumer<Integer> fun = (item) -> System.out.print(item *2 + " ");      //same fun by using consumer class.
//        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunctions cal = new LambdaFunctions();
        System.out.println(cal.operate(5,4, sum));
        System.out.println(cal.operate(5,4, sub));
        System.out.println(cal.operate(5,4, prod));
        System.out.println(cal.operate(8,4, div));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }

}
interface Operation{
    int operation(int a, int b);
}
