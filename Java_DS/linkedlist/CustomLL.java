package linkedlist;

public class CustomLL {

    private Node head;
    private Node tail;

    private int size;


    public CustomLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value , Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
