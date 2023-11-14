package _09OOPs.OOP2;

public class InnerOuterClasses {        // this is outer class.
    static class Test{      // this is inner class, static means it's not depend on object of outer class.
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Aditya");
        Test obj1 = new Test("Ravi");

        System.out.println(obj.name);
        System.out.println(obj1.name);
    }
}
