package _09OOPs.OOP4.access1;

public class Parent {
    private int a;
    // this is private.
    // it only has access in this class.

    int b;
    // this is default access modifier.
    // it has access within package.

    protected int c;
    // this is protected access modifier.
    // it has access outside package but by subclass only.
    public int d;
    // this is public access modifier.
    // it has access to everywhere (including anywhere outside package)


    // everyone can be accessed within class.
    // examples.
    public int getA(){
        return a;
    }
    public void setA(int num){
        this.a = num;
    }
    public void setValues(int b, int c, int d){
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
class Child extends Parent{
    void print(){
//        a = 54;     // we cant access "a" in subclass
        b = 2;         // we can access b, c, d because they are in same package.
        c = 5;
        d= 10;
        System.out.println("this is child class");
    }
}

