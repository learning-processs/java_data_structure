package linkedListInterview;

import org.w3c.dom.NodeList;

public class SortLL {
    ListNode head;
    ListNode tail;

    int size;
    public SortLL(){
        this.size = 0;
    }

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


    public void bubbleSort(){
        bubbleSort(size - 1 , 0);
   
    }

    
    public void bubbleSort(int row, int col){
        if (row == 0) {
            return;
        }

        if (col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if(first.val > second.val){
                // swap 
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;

                }else if(second == tail){
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    ListNode prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col +1);
        }else{
            bubbleSort( row -1 , 0 );
        }
    }

    public ListNode get(int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
 public void insertFirst(int val) {
        ListNode newNode = new ListNode(val);
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
        ListNode newNode = new ListNode(val);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
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
        SortLL sl = new SortLL();
        for(int i = 5 ; i > 0 ; i-- ){
            sl.insertAtLast(i);
        }

        sl.display();
        sl.bubbleSort();
        sl.display();
    }
}
