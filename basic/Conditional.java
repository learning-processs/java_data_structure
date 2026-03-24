package basic;
import java.util.Scanner;

// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your Salary : ");
//         int num1 = sc.nextInt();
//         if(num1 >5000){
//             num1+=2000;
//         }else{
//             num1+=1000;
//         }
//         System.out.println(num1);

//     }
// }

// public class conditional {

//     public static void main(String[] args) {
//         int salary = 7000;
//         if(salary >5000){
//             salary+=3000;
//         }else if(salary>2000){
//             salary+=2000;
//         }else{
//             salary+=1000;
//         }
//         System.out.println(salary);
//     }
// }

//--------------------------------------------------------FOR LOOP

// public class conditional {
//     public static void main(String[] args) {

//         for(int i=1 ; i<=5 ; i +=2){
//             System.out.println(i);
//         }

//     }
// }

//--------------------------------------------------------WHILE LOOP

// public class conditional {
//     public static void main(String[] args) {
//         int num = 1;
//         while (num<=5) {
//             System.out.println(num);
//             num++;
//         }

//     }
// }

//--------------------------------------------------------DO WHILE LOOP

// public class conditional {
//     public static void main(String[] args) {
//         int n = 1;
//         do {
//             System.out.println(n);
//             n++;
//         }while(n<=5);

//     }
// }
//--------------------------------------------------------LARGEST

// public class conditional {
//     public static void main(String[] args) {
//         int n = 8;
//         int m = 10;
//         int l = 5;
//         if(n<=0){
//             System.out.println("Invalid");
//         }
//         if(n>m && n>l){
//             System.out.println("N");
//         }else if (m>n && m>l){
//             System.out.println("M");
//         }else{
//             System.out.println("L");
//         }

//     }
// }

// OR

// public class conditional {
//     public static void main(String[] args) {
//         int n = 8;
//         int m = 10;
//         int l = 5;

//         int max = n;
//         if(m>max){
//             max =m;
//         }
//         if(l>max){
//             max= l;
//         }
//         System.out.println(max);

//     }
// }

// OR

// public class conditional {
//     public static void main(String[] args) {
//         int n = 8;
//         int m = 10;
//         int l = 5;

//         int max = Math.max(l,Math.max(n,m));
//         System.out.println(max);
//     }
// }

// public class conditional {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter your char : ");
//         char ch = in.next().trim().charAt(0);
//         System.out.println(ch);
//     }
// }

// public class conditional {

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 6;

//        if(a !=b){
//         System.out.println("True");
//        }
//     }
// }

//--------------------------------------------------------FIBONACCI

// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Number : ");
//         int n = sc.nextInt();
//         int p = 0;
//         int c = 1;
//         int count = 2;

//         while (count <= n) {
//             int tem = c;
//             c = c + p;
//             p = tem;
//             count++;
//         }
//         System.out.println("Fibonacci No. of " + n + " is : " + c);
       
//     }
// }

//------------------------------------------------------No of occurance

// public class conditional{
//     public static void main(String args[]){
//         int n []= {1,3,8,5,1,7,5,7,8,7,9};
//         int key = 10;

//         int count = 0;
//         for(int i= 0 ;i<n.length ; i++){
//             if(key == n[i]){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
//----------------------------OR

// public class conditional {
//     public static void main(String[] args) {
//         int n = 1387839;
//         int count= 0;
//         while (n>0) {
//             if(n%10==8){
//                 count++;
//             }
//             n = n/10;
//         }
//         System.out.println(count);

//     }
// }

//------------------------------------------------------Reverse 

// public class conditional {

//     public static void main(String[] args) {
//         int n = 23597;  //79532

//         int ans = 0;
//         while (n>0) {
//             int rem = n%10;
//             n/=10;

//             ans = ans * 10 + rem;
//         }
//         System.out.println(ans);

//     }
// }

//-----------------------------------------------------Calculator

public class Conditional {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Choose what operation to perform : ");
            char op = in.next().charAt(0);
            
            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
                System.out.print("Enter your 2 Numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if( op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid");
            }
            System.out.print(ans);

        }
    }
}
