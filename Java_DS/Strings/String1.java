package Strings;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(name);

        name = "Anu";  // here we are not changing the name we are creating a new object.
        System.out.println(name);





        String a = "Anu";  // ans -> true
        String b = "Anu";
        System.out.println(a == b);

        // Explicitly creating a new object they all(value) in diff pool in heap->false
        String c = new String("Anu");
        String d = new String("Tina");
        System.out.println(c.compareTo(d));
        System.out.println(c == d);
        System.out.println("Equal : "+c.equals(d));
        System.out.println("Index : "+c.charAt(0));



        System.out.println(56);
        Integer num = new Integer(56);  // Wrapper classes
        System.out.println(num);

        System.out.println("Avani");
        System.out.println(Arrays.toString(new int[] {2,3,4,60}));

        String name1 = null ;
        System.out.println("Name1 : " + name1);

    }
}
