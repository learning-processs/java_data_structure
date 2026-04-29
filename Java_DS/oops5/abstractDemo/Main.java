package oops5.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son s1 = new Son(21);
        s1.career();
        s1.partner();
        System.out.println();


        Daughter d1 = new Daughter(21);
        d1.career();
        d1.partner();
        System.out.println("Daughter Age : " + d1.age);

    }
}
