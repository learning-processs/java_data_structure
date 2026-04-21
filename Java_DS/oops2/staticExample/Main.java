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

        Main funn = new Main();
        funn.fun2();

    }

   

        // Not dependent on Obj....
        static void fun(){
            // greeting(); // you cant use this because it requites an instance
            // But the function you are using it in does not depend on instances

            Main obj = new Main();
            obj.greeting();
        }


    void fun2() {
        greeting();
    }
    

    // Dependent on Obj...
    void greeting(){
        System.out.println("hello! I'm Anu...!");
    }

}
