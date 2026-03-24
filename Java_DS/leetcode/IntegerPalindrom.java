package leetcode;

public class IntegerPalindrom {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrom(x));
    }

    static boolean isPalindrom(int x){
        if(x < 0){
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x%10;
            reverse = reverse*10 +digit;
            x /= 10;
        }
        return original == reverse ;
    }
}
