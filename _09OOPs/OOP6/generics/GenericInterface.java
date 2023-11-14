package _09OOPs.OOP6.generics;

public interface GenericInterface <T>{
    void display(T value);
}
class Main implements GenericInterface<Integer>{
    @Override
    public void display(Integer value){
        System.out.println(value);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display(45);
    }
}
