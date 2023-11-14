package _09OOPs.OOP1;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 60;
//        Integer b = a;  // autoboxing
//        System.out.println(a + " " + b);

//        Integer a = 45;
//        int b = a;      // unboxing
//        System.out.println(a + " " + b);

        // final keyword
        final A st1 = new A("Aditya");
        st1.name = "Ravi";      // here we can change it.

        // when a non-primitive is final, you cant reassign it.
        // st1 = new A("vikas");    // wrong, you cant do this.

        System.out.println(st1.name);
    }
}
class A{
    String name;
    A(String name){
        this.name = name;
    }

}
