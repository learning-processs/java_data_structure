package stacksAndQueus;

public class CircularQueue {

    protected int[] data;
    public static final int DEFAULT_SIZE = 20;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty..");
        }

        return data[front];
    }

    public void display() {
       if(isEmpty()){
        System.out.println("Empty");
        return;
       }

       int i = front;

       do {
        System.out.print(data[i] + " -> ");
        i++;
        i %= data.length;
       } while (i != end);
       System.out.println("End");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue();
        q.insert(4);
        q.insert(9);
        q.insert(5);
        q.insert(1);
        q.insert(6);

        System.out.println(q.remove());

        q.display();
    }
}
