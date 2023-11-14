package _09OOPs.OOP4.access2;

import _09OOPs.OOP4.access1.*;

// this class is for checking if some variables will work outside package or not.

class Child2 extends Parent{
    void fun(int n){
//        this.b = n;     // we cant access default modifier outside package by subclass.

        this.c = n;         // protected modifier has access outside the package by subclass only.
        this.d = n;         // public can be accessed anywhere.
    }
}
public class OutsidePackage {
    public static void main(String[] args) {
        Child2 obj = new Child2();
//        obj.a = 1;        // these don't have access to outside world.
//        obj.b = 2;
//        obj.c = 3;
        obj.d = 90;         // public can be accessed outside world.
    }
}
