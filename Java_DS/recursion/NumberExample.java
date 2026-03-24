package recursion;

public class NumberExample {
    public static void main(String[] args) {
        // 1 to 5
        print(1);
    }
    

    static void print(int n){

        if(n==5){                          // Base condition
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }


    // ------------------------------------
    static void printNum1(int n){
        System.out.println(n);
        printNum2(2);
    }
    static void printNum2(int n){
        System.out.println(n);
        printNum3(3);
    }
    static void printNum3(int n){
        System.out.println(n);
        printNum4(4);
    }
    static void printNum4(int n){
        System.out.println(n);
        printNum5(5);
    }
    static void printNum5(int n){
        System.out.println(n);
    }
    
}
