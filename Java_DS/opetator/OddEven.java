package opetator;

// e.g. 0 1 0 1
//    & 0 0 0 1
//      0 0 0 1-> end 1 means odd

// Last bit is LSB , First one MSB

public class OddEven {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(isOdd(n));
    }    

    static boolean isOdd(int n){
        return (n & 1) == 1; // odd
    }
}