package _09OOPs.OOP6.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            int c = a/b;
            System.out.println(divide(a, b));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("don't divide by zero");
        }
        return a/b;
    }
}
