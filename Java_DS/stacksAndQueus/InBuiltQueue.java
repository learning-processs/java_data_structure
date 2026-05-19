package stacksAndQueus;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new  LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.peek()); // top

        System.out.println(queue.remove()); //  Remove the top one

        
    }
}
