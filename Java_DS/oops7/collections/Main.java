package oops7.collections;

import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        list2.isEmpty();
        list2.add(25);
        list2.add(7);
        list2.add(116);

        System.out.println(list2);

        list1.isEmpty();

        // Synchronise -> wait not multiple threads can access at same time..
        // Arraylist -> all can access at same time
        List<Integer> vector = new Vector<>();
        vector.add(7);
        vector.add(16);
        vector.add(25);

        System.out.println(vector);

    }
}
