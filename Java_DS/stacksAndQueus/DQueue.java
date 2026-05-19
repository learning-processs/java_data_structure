package stacksAndQueus;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueue {

    public static void main(String[] args) {
        
        Deque<Integer> deque = new ArrayDeque<>();  //No capacity limitation, fast than ll and stack
        deque.add(2);
        deque.add(5);
        deque.add(9);
        deque.addFirst(2);
        deque.addLast(44);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
