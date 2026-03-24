package basic;
import java.util.Scanner;


// public class Introduction {
//     public static void main(String[] args) {
//         System.out.println("hello world!!");
//     }
// }


// -------------------------------------INPUT


// public class Introduction {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter your Name: ");
//         String Name = input.nextLine();
//         System.out.println("Name -> "+Name);

//     }
// }

// -------------------------------------TYPECASTING

public class Introduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //TYPECASTING

        // int num = (int)(67.56f);
        // System.out.println(num);

        // automatic type promotion

        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // int c = 100;
        // int d = a*b/c;
        // System.out.println(d);

        // System.out.println("नमस्ते");

        byte b = 43;
        char c = 'a';
        short s = 1024;
        int i = 500000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c) - (d-s);
        System.out.println((f*b)+" " +(i/c) +" " + (d-s));
        System.out.println(result);


    }
    
}
