package recursion;

public class FibonacciNum {
    public static void main(String[] args) {

        int result = fn(50);
        System.out.println(result);

    }

    static int fn(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n < 2){
            return n;
        }
        return fn(n-1) + fn(n-2);
  
    }
}
