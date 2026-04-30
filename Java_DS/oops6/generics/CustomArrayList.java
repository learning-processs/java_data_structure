package oops6.generics;

import java.util.ArrayList;

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(7);
        list.add(25);
        list.add(16);
        list.remove(0);
        System.out.println(list.get(0));
        list.set(1, 45);
        list.size();
        list.isEmpty();
    }
}
