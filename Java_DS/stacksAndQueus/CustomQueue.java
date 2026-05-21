package stacksAndQueus;

public class CustomQueue {

    int[] data;
    public static final int DEFAULT_SIZE = 20;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        return true;

    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty.");
        }

        int remove = data[0];

        for(int i = 1; i <end ; i++){
            data[i -1] = data[i];
        }
        end--;
        return remove;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty...");
        }
        return data[0];
    }

    public void display(){
        for(int i = 0 ; i < end ; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println("END");
    }

    

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();
        q.insert(4);
        q.insert(9);
        q.insert(5);
        q.insert(1);
        q.insert(6);

        q.display();
    }
}
