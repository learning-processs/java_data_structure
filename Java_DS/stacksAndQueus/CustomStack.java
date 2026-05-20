package stacksAndQueus;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws CustomStackException{
        if (isEmpty()) {
            throw new CustomStackException("Can't pop from an empty Stack..");
        }

        // int removed = data[ptr];
        // ptr --;
        // return removed;

        return data[ptr--];
    }

    public int peak()throws Exception{
        if (isEmpty()) {
            throw new Exception("Can't pop from an empty Stack..");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr == data.length -1;
    }

     private boolean isEmpty(){
        return ptr == -1;
    }

     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Stack: [");

        for (int i = 0; i <= ptr; i++) {
            sb.append(data[i]);

            if (i < ptr) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
    

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        stack.push(34);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        System.out.println(stack);
    }
}
