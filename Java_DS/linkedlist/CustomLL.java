package linkedlist;

public class CustomLL {

    private Node head;
    private Node tail;

    private int size;

    public CustomLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtLast(int val){
        if(tail ==null){
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;

        size ++;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return ;
        }
        if(index == size){
            insertAtLast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val , temp.next) ;
        temp.next = newNode;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
