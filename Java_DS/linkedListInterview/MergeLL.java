package linkedListInterview;

public class MergeLL {
    Node head;
    Node tail;

    int size ;

    private MergeLL(){
        this.size = 0;
    }

    public static MergeLL merge(MergeLL first , MergeLL second){

        Node fir = first.head;
        Node sec = second.head;


        MergeLL ans = new MergeLL();

        while (fir != null && sec != null) {
            
            if(fir.val < sec.val){
                ans.insertAtLast(fir.val);
                fir = fir.next;
            }else{
                ans.insertAtLast(sec.val);
                sec = sec.next;
            }
        }

        while (fir != null) {
            ans.insertAtLast(fir.val);
            fir = fir.next;
        }

        while (sec != null) {
            ans.insertAtLast(sec.val);
            sec = sec.next;
        }

        return ans;
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

    public void insertAtLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void display(){

        Node node = head;
        while (node != null) {
            System.out.print(node.val + " - > ");
            node = node.next;
        }
        System.out.println("End");
    }

    public class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        
    }
    public static void main(String[] args) {
        MergeLL firstLL = new MergeLL();
        MergeLL secondLL = new MergeLL();

        firstLL.insertAtLast(1);
        firstLL.insertAtLast(3);
        firstLL.insertAtLast(5);

        
        secondLL.insertAtLast(1);
        secondLL.insertAtLast(2);
        secondLL.insertAtLast(9);
        secondLL.insertAtLast(14);


        MergeLL ans = MergeLL.merge(firstLL, secondLL);
        ans.display();

    }
}
