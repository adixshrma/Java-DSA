package _10LinkedLists.circular;

public class CustomCircularLL {
    private int size;
    private Node head;
    private Node tail;

    public CustomCircularLL(){
        this.size = 0;
    }
    // displaying items
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " ");
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println();
    }
    // adding element in last
    public void add(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }
    // deletion of last value.
    public void delete(){
        Node temp = head;
        while(temp.next!= tail){
            temp= temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
    }
    // delete particular value.
    public void delete(int value){
        if(value == head.value){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        Node temp = head;
        do{
            if(temp.next.value == value){
                temp.next = temp.next.next;
                size--;
                break;
            }
            temp = temp.next;
        }while(temp != head);
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
