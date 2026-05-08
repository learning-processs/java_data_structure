package linkedlist.circularLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomCLL cll = new CustomCLL();
        cll.insert(7);
        cll.insert(16);
        cll.insert(25);
        cll.delete(16);

        cll.display();
    }
}
