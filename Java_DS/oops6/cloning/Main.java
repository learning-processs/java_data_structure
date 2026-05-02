package oops6.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human h1 = new Human(21 , "Anu");
        // Human twin = new Human(h1);


        Human twin =(Human)h1.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

    }

}
