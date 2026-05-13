package linkedListInterview;

public class SortLL {

     public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split list
        ListNode rightHead = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        ListNode merge = mergeTwoLists(left, right);

        return merge;
    }

    // public ListNode middleNode(ListNode head) {

    //     ListNode slow = head;
    //     ListNode fast = head;

    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }

  

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode dummyHead =  new ListNode();
    ListNode current = dummyHead;

    
       while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
            current.next = list1;
            list1 = list1.next;
        }else{
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
       }

       if(list1 != null){
        current.next = list1;
       }

       if(list2 != null){
        current.next = list2;
       }

       return dummyHead.next;
     
    }


    
    public class ListNode {
        int val;
        ListNode next;

        public ListNode(){

        }

        public ListNode(int val) {
            this.val = val;
        }

    }

    public static void main(String[] args) {

    }
}
