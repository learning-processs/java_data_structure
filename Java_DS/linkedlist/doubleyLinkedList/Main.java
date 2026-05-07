package linkedlist.doubleyLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomDLL cd = new CustomDLL();

        // cd.insertFirst(25);
        // cd.insertFirst(16);
        // cd.insertFirst(7);
        cd.display();
        cd.insertFirst(25);
        cd.insertFirst(16);
        cd.insertFirst(7);
        cd.insert(16, 88);
        cd.displayRev();
    }
}
