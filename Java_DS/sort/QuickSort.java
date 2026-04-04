package sort;

import java.util.Arrays;

// pivote => Any element can choose as pivote
/* After every pass all elements less than pivote will be on left of pivote
and geater then pivote at right side
here -> put the pivote at  correct position at every pass
*/

/*
 */

public class QuickSort {
    public static void main(String[] args) {
        int arr [] = { 8, 3, 4, 12,5,6};
        quickSort(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr[] ,int low, int high) {
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivote = arr[m];

        while (s <= e) {
            while (arr[s] < pivote) {
                s++;
            }
            while (arr[e] > pivote) {
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
