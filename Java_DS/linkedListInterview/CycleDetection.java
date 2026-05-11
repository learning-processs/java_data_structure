package linkedListInterview;

// Fast and slow pointer Method
/* */
// Return T or F
public class CycleDetection {
    Node head;

    public boolean detectCycle() {

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void display() {
        System.out.print("prev <- ");
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " <- -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
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

        boolean ans = list.detectCycle();
        System.out.println("Cycle Present : " + ans);

    }
}
