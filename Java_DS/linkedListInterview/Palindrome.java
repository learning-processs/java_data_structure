package linkedListInterview;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {

        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

        // Compare both the  halves;

        while (head != null && headSecond != null) {
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        
        reverseList(reverseHead);

        return head == null || headSecond == null;
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

        retu prev;
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
