package linkedListInterview;

public class ReverseLLInRange {
    ListNode head;
    int size;
    public ReverseLLInRange(){
        this.size = 0;
    }

    public ListNode revereBetween(ListNode head , int left , int right){
        if( left == right){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        for(int i = 0 ; current != null && i < left - 1 ; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;

        // reverse b/w lef and right

        ListNode next = current.next;
        for (int index = 0; current !=null &&  index < right - left + 1; index++) {
            current.next = prev;
            prev = current;
            current = next ;
            if(next != null){
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    public void reverse() {

        if (head == null || head.next == null) {
            return;
        }

        ListNode prev = null;
        ListNode pres = head;

        while (pres != null) {

            ListNode next = pres.next;

            pres.next = prev;

            prev = pres;
            pres = next;
        }

        head = prev;
    }

    public void insertFirst(int val) {

        ListNode node = new ListNode(val);

        node.next = head;
        head = node;

        size++;
    }

    public void display() {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        
    }
}
