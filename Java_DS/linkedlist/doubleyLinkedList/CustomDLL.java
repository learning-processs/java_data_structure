package linkedlist.doubleyLinkedList;

// null <-8 -><- 3->2 -><-1 null
public class CustomDLL {

    private Node head;
    // private Node tail;

    private int size;

    public CustomDLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

        size++;
    }

    public void display(){
        System.out.print("prev <- ");
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " <- -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void displayRev(){
        System.out.print("prev <- ");
        Node node = head;
        Node last = null;

        while (node != null) {
            System.out.print(node.val + " <- -> ");
            last = node;
            node = node.next;
        }

        System.out.print("END");
        System.out.println();
        while (last != null) {
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.print("START");
    }


   public class Node {
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }

        Node(int val , Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
   }
}
