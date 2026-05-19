package linkedListInterview;

public class Reorderd {

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);
        ListNode secHead = reverseList(mid);
        ListNode firHead = head;

        // rearrange

        while (firHead != null && secHead != null) {
            
            ListNode temp = firHead.next;
            firHead.next = secHead;
            firHead = temp;

            temp = secHead.next;
            secHead.next = firHead;
            secHead = temp;
        }

        // next of tail to null;
        
        if(firHead != null){
            firHead.next = null;
        }
    }

    public ListNode reverseList( ListNode head) {
        if (head == null ) {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while (pres != null) {

            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }

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

        ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        
    }
}
