package stacksAndQueus;

public class CustomDynamicStack extends CustomStack{

    public CustomDynamicStack(){
        super();
    }

    public CustomDynamicStack(int size){
        this.data = new int[size];
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all prev itmem in new data
            for (int i = 0; i < temp.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);

    }
    public static void main(String[] args) {
        CustomDynamicStack stack = new CustomDynamicStack();

        stack.push(34);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        System.out.println(stack);
    }
}
