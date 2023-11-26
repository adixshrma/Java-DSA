package _10LinkedLists.doubly;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLL list = new CustomDoublyLL();
//        list.insertFirst(4);
//        list.insertFirst(45);
//        list.insertFirst(41);
//        list.insertFirst(40);

        list.add(4);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(1);
        list.display();
        list.insert(100, 5);
        list.display();
//        list.displayReverse();

    }
}
