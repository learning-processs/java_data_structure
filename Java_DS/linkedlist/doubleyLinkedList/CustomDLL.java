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

    public void insertAtLast(int val){
        Node newNode = new Node(val);
        Node last = head;

        newNode.next = null;

        if(head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev  = last;
    }

    public Node find(int val){
        Node node = head;

        while (node != null) {
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after ,int val){
        Node prev = find(after);

        if(prev == null){
            System.out.println("Does not exist...");
        }

        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
        newNode.prev = prev;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
        

        // newNode.next = prev.next;
        // newNode.prev = prev;
        // prev.next = newNode;
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
