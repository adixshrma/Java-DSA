package _09OOPs.OOP3.Inheritance._01Single_MultiLevel;


public class Main {
    public static void main(String[] args) {
//        Box obj1 = new Box(24.5, 67, 87);
//        Box obj2 = new Box(obj1);
//        System.out.println(obj1.h + " " + obj1.w + " " + obj1.l);
//        System.out.println(obj2.h + " " + obj2.w + " " + obj2.l);


//        BoxWeight obj3 = new BoxWeight();
//        BoxWeight obj4 = new BoxWeight(15,25,96,100);
//        BoxWeight obj5 = new BoxWeight(obj4);
//
//        System.out.println(obj3.l + " " + obj3.w + " " + obj3.h + " " + obj3.weight);
//        System.out.println(obj4.l + " " + obj4.w + " " + obj4.h + " " + obj4.weight);
//        System.out.println(obj5.l + " " + obj5.w + " " + obj5.h + " " + obj5.weight);


//        Box obj6 = new BoxWeight(4,5,9,50);
//        System.out.println(obj6.h);    // it cannot access weight. (obj6.weight)

        // because type of object do not determine what members can access, its type of reference variable.
        // object -> new BoxWeight(4,5,9,50);
        // reference variable -> Box obj3
        // and in this example reference variable is of Parent's class, hence can't access child members.

//        BoxWeight obj7 = new Box(4,5,7);
        // you cant have child reference variable and parent object, hence error in above line.


        // This is for multilevel inheritance.
        BoxPrice obj8 = new BoxPrice();
        BoxPrice obj9 = new BoxPrice(4,5,6,50,100);
        BoxPrice obj10 = new BoxPrice(obj9);

        System.out.println(obj8.h + " " + obj8.weight + " " + obj8.price);
        System.out.println(obj9.w + " " + obj9.weight + " " + obj9.price);
        System.out.println(obj10.w + " " + obj10.weight + " " + obj10.price);
    }
}
