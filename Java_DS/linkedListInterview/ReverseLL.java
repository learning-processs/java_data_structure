package linkedListInterview;

public class ReverseLL {

    ListNode head;
    int size;

    public ReverseLL() {
        this.size = 0;
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

        ReverseLL list = new ReverseLL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();

        list.reverse();

        list.display();
    }
}