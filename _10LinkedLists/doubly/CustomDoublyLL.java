package _10LinkedLists.doubly;

public class CustomDoublyLL {
    private int size;
    private Node head;
    private Node tail;
    public CustomDoublyLL(){
        this.size = 0;
    }
    // Displaying elements.
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayReverse(){
        Node last = head;
        while(last.next != null){       // here we iterated over last Node
            last = last.next;
        }
        while(last != null){            // here we are going backward and printing it.
            System.out.print(last.value + " ");
            last = last.pre;
        }
        System.out.println();
    }
    // Inserting Elements.
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.pre = null;
        if(head != null){
            head.pre = node;
        }
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void add(int value){        // insert end
        if(head == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        node.next = null;
        node.pre = tail;
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            add(value);
            return;
        }
        Node temp1 = head;
        for (int i = 1; i < index; i++) {
            temp1 = temp1.next;
        }
        Node temp2 = head;
        for (int i = 0; i < index; i++) {       // its running 1 more time
            temp2 = temp2.next;
        }
        Node node = new Node(value, temp1, temp2);
        temp1.next = node;
        temp2.pre = node;
        size++;
    }
    private class Node{
        private int value;
        private Node next;
        private Node pre;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node pre, Node next){
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }
}
