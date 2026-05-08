package linkedlist.circularLinkedList;

public class CustomCLL {

    private Node head;
    private Node tail;


    // public CustomCLL(Node head , Node tail){
    //     this.head = null;
    //     this.tail = null;
    // }

    public void insert(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val){
        Node node = head;
        if(head == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
        }

        do {
            Node n = node.next;
            if( n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);


    }


    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.print("END");
    }
    
    public class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
        
    }
}
