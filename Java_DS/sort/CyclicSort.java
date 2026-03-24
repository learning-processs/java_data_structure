package sort;

import java.util.Arrays;

//  NOTE : when given no. from range 1,N = > Cyclic sort
// Index = value -1 eg Index = 0 val=1  (1-1=0)

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5,  2,1, 4 };
        //  int arr[] = { 5,6,7,8};   Wrong


        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Cyclic(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        
    }
}
