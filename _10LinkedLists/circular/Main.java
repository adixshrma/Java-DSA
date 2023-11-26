package _10LinkedLists.circular;

public class Main {
    public static void main(String[] args) {
        CustomCircularLL list = new CustomCircularLL();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(9);
        list.display();
//        list.delete();

//        list.delete(1);
//        list.delete(9);
//        list.delete(8);
        list.delete(9);
        list.display();
    }
}
