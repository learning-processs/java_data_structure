package linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLL ll = new CustomLL();
        
        ll.insertFirst(7);
        ll.insertFirst(16);
        ll.insertFirst(25);

        ll.insertAtLast(12);
        ll.insert(10, 2);
        ll.display();

        
    }
}
