package _09OOPs.OOP3.Polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "{" + num + "}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
