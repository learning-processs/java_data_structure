package arr;

import java.util.Arrays;

public class Func {
    public static void main(String[] args) {
        int[] nums = {4,1,5,7,8};
        System.out.print("Original Value :");
        System.out.println(Arrays.toString(nums));

        System.out.print("Changed Value :");
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 12;
    }
}
