package oops;

public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10 ;
        // int b = 20;
        // Integer num = 45; // Object

        // Integer is Final class => so it not change the value when swap

        Integer a = 10;
        Integer b = 20;


        swap(a, b);
        System.out.println(a +" " + b);

        final int BONUS = 30;
        // BONUS = 20; can't modify becoz final keyword is present there..

        final A  anu = new A("Anu Kushwaha");
        anu.name = "Other name";
    }

    static void swap(Integer a , Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {

    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

}
