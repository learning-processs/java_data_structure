package oops1;

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

        // When a non-premitive is final, you cannt
        // anu = new A("new Obj");


        A obj ;
        for(int i = 0 ; i< 100 ; i++){
            obj = new A("Random Name");
        }
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

    // We can't free the m/m but can tell what to do
    @Override                                              // When this fuction is avaliable in class and it destoyed by grabage classs it called
    protected void finalize() throws Throwable{
        System.out.println("Object is destoryed...");
    }

}
