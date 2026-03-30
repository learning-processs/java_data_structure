package rec_1;

public class NumOfZero2 {
    public static void main(String[] args) {
        int n = 120701;
        System.out.println(count(n));
    }

    static int count(int n){
        return helper(n , 0);
    }

    static int helper(int num, int count){
        if( num == 0){
            return count;
        }

        int rem = num % 10;
        if(rem == 0){
            return helper(num/10, count + 1);
        }
        return helper(num/10, count);
    }
}
