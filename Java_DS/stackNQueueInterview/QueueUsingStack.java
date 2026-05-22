package stackNQueueInterview;

import java.util.Stack;

public class QueueUsingStack {

    
    public static void main(String[] args) throws Exception{
         QUsingStack q = new QUsingStack();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove());
        System.out.println(q.remove());

        q.add(40);

        System.out.println(q.remove());
    }
}

class QUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{

        if (first.isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;

    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{
        if (first.isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }
    
}
