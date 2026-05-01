package oops6.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }

        data[size++] = num;
    }


    private void resize() {
       int[] temp = new int[data.length * 2];

       // copy in new Array;
       for(int i = 0 ; i < data.length ; i++){
        temp[i] = data[i];
       }

       data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }


    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public  int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CutomArrayList{" + 
        "data=" + Arrays.toString(data) + 
        ", size=" + size + 
        '}';
        
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(7);
        list.add(16);
        list.add(25);

        for(int i = 0 ; i < 14 ; i++){
            list.add(2 * i);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();  // Integer => generic
        list2.add(4);
        System.out.println(list2);

    /*
        ArrayList list = new ArrayList<>();

         * list.add(7);
         * list.add(25);
         * list.add(16);
         * list.remove(0);
         * System.out.println(list.get(0));
         * list.set(1, 45);
         * list.size();
         * list.isEmpty();
         */

    }
}
