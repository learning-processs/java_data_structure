package oops2.staticExample;

public class Main {
    public static void main(String[] args) {
        Human anu = new Human(21,"Anu",10000000,false);
        Human vin = new Human(23,"Vin",10000000,false);
        Human akash = new Human(17,"Akash",10000000,false);

        System.out.println(vin.name);
        System.out.println(vin.age);
        System.out.println(vin.salary);
        System.out.println(vin.married);
        System.out.println(anu.population);
        System.out.println(vin.population);
        System.out.println(akash.population);

    }


    // Not dependent on Obj....
    static void fun(){
        greeting();
    }

    // Dependent on Obj...
    void greeting(){
        System.out.println("hello");
    }

}
