package _10LinkedLists.singly;

public class CustomLL {
    private Node head;
    private Node tail;
    private int size;
    public CustomLL(){
        this.size = 0;
    }


    // display List.
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    // insertion in list.
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void add(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index) throws Exception{
        if (index > size){
            throw new Exception("Index out of bound, enter value less than size of list");
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            add(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // deletion from list.
    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void deleteLast(){
        if(head == null || head.next == null){
            deleteFirst();
            return;
        }
        Node secondLast = head;
        for (int i = 0; i < size-2; i++) {
            secondLast = secondLast.next;
        }
        tail = secondLast;
        tail.next = null;
        size--;
    }
    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        Node pre = head;
        for (int i = 0; i < index -1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }
    // get value of a particular index.
    public int get(int index){
        if(index == 0){
            return head.value;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
