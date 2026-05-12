package linkedListInterview;

// Fast and slow pointer Method
/* */
// Return T or F
public class CycleDetection {
    ListNode head;
    ListNode tail;

    int size;

    public CycleDetection() {
        this.size = 0;
    }

    public boolean hasCycle() {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle() {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // Calculate the length;
                ListNode temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        return 0;
    }


    public ListNode detectCycle(ListNode head){
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthOfCycle();
                break;
            }
        }
        // Find the start 
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        //keep moving both forward they meet at start;
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;

    }

    public void insertFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
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

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }

        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        ListNode newNode = new ListNode(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public void display() {
        System.out.print("prev <- ");
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " <- -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;

        }

    }

    public static void main(String[] args) {
        CycleDetection list = new CycleDetection();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.head.next.next.next.next.next = list.head.next.next;

        boolean ans = list.hasCycle();
        System.out.println("Cycle Present : " + ans);

        int len = list.lengthOfCycle();
        System.out.println(len);




        // Creating nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        // Connecting nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Creating cycle
        // 5 -> 3
        n5.next = n3;

        // Passing head
        ListNode ans1 = list.detectCycle(n1);

        if (ans1 != null) {
            System.out.println("Cycle starts at node: " + ans1.val);
        } else {
            System.out.println("No cycle");
        }

    }
}
