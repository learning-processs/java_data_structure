package largerNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargerNum {

   public static void main(String[] args) {
    int a = 30 ; // primitive
    int b = 67;

    BigInteger A = BigInteger.valueOf(33);  // Big Number
    BigInteger B = BigInteger.valueOf(33);
    BigInteger C = BigInteger.valueOf(33857547);
    System.out.println(C);

    // constants 
    BigInteger D = BigInteger.TEN;
    System.out.println(D);

    // addition
    BigInteger s = A.add(B);
    System.out.println(s);

    BigInteger sub = A.subtract(B);
    System.out.println(sub);

    BigInteger m = A.multiply(B);
    System.out.println(m);

    BigInteger d = A.divide(B);
    System.out.println(d);

    BigInteger rem = A.remainder(B);
    System.out.println(rem);

   }
}


class factorial {

    static BigInteger fact(int num){

        BigInteger ans = new BigInteger("1");

        for (int i = 2; i <= num ; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }        

        return ans;
    }

    static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y - x;
        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");

        BigDecimal ans1 = Y.subtract(X);
        System.out.println(ans1);
    }

    public static void main(String[] args) {
        // BigInteger ans = fact(100);
        // System.out.println(ans);

        BD();
    }
}
