package basic;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Fun {
//     public static void main(String[] args) {
//      int result = sum();
//      System.out.println(result);
//     }

//     static int sum(){
//         int a = 5;
//         int b = 5;
//         int sum = a + b;
//         return sum;
//     }
// }

//--------------------------------------------Void type
// public class fun {
//     public static void main(String[] args) {
//         hW();
//     }
//     static void hW(){
//         System.out.println("hello World");
//     }
// }

//--------------------------------------Return String type 

// public class fun {
//     public static void main(String[] args) {
//         String result = hW();
//         System.out.println(result);
//     }

//     static String hW(){
//         return "Hello";
//     }
// }

// public class fun {
//     public static void main(String[] args) {
//         String message =greet();
//         System.out.println(message);
//     }
//     static String greet(){
//         String greeting = "Hi, how about you!";
//         return greeting;
//     }
// }

//--------------------------------------------ARGUMENTS
// public class fun {
//     public static void main(String[] args) {
//        int result =  sum(3,5);
//        System.out.println(result);
//     }
//     static int sum(int n1 , int n2){
//         int add = n1+n2;
//         return add;
//     }
// }


// public class fun {
//     public static void main(String[] args) {
//         String result = hW("Anu");
//         System.out.println(result);
//     }
//     static String hW(String name){
//         String message = "hello " + name +"!";
//         return message;
//     }
// }

//--------------------------------------------void no parameter swap
// public class fun {
//     public static void main(String[] args) {
//        swap();
//     }
//     static void swap(){
//         int a = 10;
//         int b = 30;
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println(a +" "+ b);
//     }
// }

// --------------------------------------------ARGUMENTS

// public class fun {
//     public static void main(String[] args) {    
//       int []result = swap(10, 50);

//       System.out.println(result[0] + " " + result[1]);
//     }
//     static int[] swap(int a , int b){
//         int temp = a;
//             a = b;
//             b = temp;
//             return new int[]{a,b};
//     }
// }

// --------------------------------------------

// public class fun {
//     public static void main(String[] args) {    
//         int arr[] = {1,3,5,7,8};
//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void change(int []nums){
//        nums[0] =55;
//     }
// }

// --------------------------------------------scope

// public class fun {
//     static int n =100;
//     public static void main(String[] args) {   
//         System.out.println(n);
//         int x ;             // declare
//         x = 9;              // initialize
//         System.out.println(x);
//         fun();
//     }
//     static void fun(){
//         System.out.println(n);
//     }
// }

// --------------------------------------------Var Arguments

/* 
public class fun {
    static int n =100;
    public static void main(String[] args) {   
        fun(4,5,6,7,8,0,99);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
*/

// --------------------------------------------Overloading...
// Same name diff data type as argument

// public class fun {
//     public static void main(String[] args) {   
//         fun("tina");
//     }
//     static void fun(int a){
//         System.out.println(a);
//     }

//     static void fun(String a){
//         System.out.println(a);
//     }
// }


// --------------------------------------------PIRME

// public class fun {
//     public static void main(String[] args) {   
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter any Number : ");
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
//     }

//     static boolean isPrime(int n){

//         if(n<=1){
//             return false;
//         }
//         for(int i = 2 ; i<=n/2 ; i++){
//             if(n % i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// --------------------------------------------AMSTRONG NUMBER for 3 digit

/* 
public class fun {
    public static void main(String[] args) {   
        boolean result = isArmstrong(153);
        // System.out.println(result);

        for(int i = 100 ; i <1000 ; i++){
            if(isArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int original = n; int sum = 0;
        while (n>0) {
           int rem = n % 10 ;
           n = n/10;
           sum = sum +rem*rem*rem;
        }
        return sum == original;
    }
}
*/

