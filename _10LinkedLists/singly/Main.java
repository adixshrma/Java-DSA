package _10LinkedLists.singly;

import _10LinkedLists.singly.CustomLL;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomLL list = new CustomLL();
//        list.insertFirst(45);
//        list.insertFirst(96);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(16);

//        list.insert(100, 3);

//        list.deleteFirst();

//        list.deleteLast();

//        list.delete(2);

        System.out.println(list.get(1));
        list.display();
    }
}
