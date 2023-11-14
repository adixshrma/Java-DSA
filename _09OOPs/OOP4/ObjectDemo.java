package _09OOPs.OOP4;

public class ObjectDemo {
    int num;
    ObjectDemo(int n){
        this.num = n;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // We will go into the details when we study Hashmaps, how to create it? etc.
    // it's just a Unique representation of an object via number.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {     // this one is modified by us.
        return this.num == ((ObjectDemo)obj).num;
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(56);
//        ObjectDemo obj2 = obj;
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        ObjectDemo obj1 = new ObjectDemo(56);
        ObjectDemo obj2 = new ObjectDemo(56);

        if(obj1 == obj2){          // this tell us if they are pointing toward same object. (which is not)
            System.out.println("they are equal(1)");
        }
        if(obj1.equals(obj2)){      // it compares the value.
            System.out.println("they are equal");
        }

        // this checks if it is instance of a class or not.
        System.out.println(obj1 instanceof ObjectDemo);
        System.out.println(obj1 instanceof Object);

        // if you want some data about class use this getClass().
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
    }
}
