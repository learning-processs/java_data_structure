package oops6.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LembdaFuctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ;i < 5 ; i++){
            arr.add(i+1);
        }

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        // arr.forEach((item) -> System.out.println(item * 2));
    }

    int sum(int a , int b){
        return a+b;
    }
}
