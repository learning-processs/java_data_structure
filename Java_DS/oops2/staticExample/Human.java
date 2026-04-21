package oops2.staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello ! I belongs to Human Class...");
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
}
