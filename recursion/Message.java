package recursion;

public class Message {
    public static void main(String[] args) {
        message();
    }

    static void message(){
        System.out.println("Hello, Vinayak!");
        message1();
    }
    static void message1(){
        System.out.println("Hello, Vinni!");
        message2();
    }
    static void message2(){
        System.out.println("Hello, Tinni!");
    }

}
