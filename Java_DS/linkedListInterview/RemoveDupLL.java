package linkedListInterview;

public class RemoveDupLL {

    Node head;
    Node tail;

    private int size;
    public RemoveDupLL(){
        this.size = 0;
    };

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    
    
        
    public void duplicates(){
       Node node = head;
       while (node != null && node.next != null) {
        if (node.val == node.next.val) {
            node.next = node.next.next;
            size --;
        }else{
            node = node.next;
        }
       }
       tail  =  node;
    };

    public class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next =next;
        }
    }

    public void display(){

        Node node = head;
        while (node != null) {
            System.out.print(node.val + " - > ");
            node = node.next;
        }
        System.out.println("End");
    }


    public static void main(String[] args) {
        RemoveDupLL rd = new RemoveDupLL();
        rd.insertFirst(7);
        rd.insertFirst(16);
        rd.insertFirst(16);
        rd.insertFirst(12);
        rd.display();
        rd.duplicates();
        rd.display();
    }
}
