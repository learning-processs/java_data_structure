package linkedListInterview;


public class MiddleOfLL {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        MiddleOfLL obj = new MiddleOfLL();

        
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        // Finding middle node
        ListNode middle = obj.middleNode(head);

        // Printing result
        System.out.println("Middle node value: " + middle.val);
    }
}
