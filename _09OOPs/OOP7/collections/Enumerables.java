package _09OOPs.OOP7.collections;

public class Enumerables {

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;

        // these are enum constants.
        // by default public, static, final
        // type = Week.
        // final = no inheritance.

        Week(){
            System.out.println("this is constructor of " + this);
        }

        @Override
        public void say() {
            System.out.println("hi!");
        }
        // internally: public static final Week Friday = new Week();
    }

    public static void main(String[] args) {
        Week week = Week.Friday;

//        System.out.println(week);
//
//        for(Week day : Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());
        week.say();
    }
}
