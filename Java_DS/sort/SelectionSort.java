package sort;

import java.util.Arrays;

// Select the element and put at right position
// Basically if we are putting at their right positon then swap both of them with each other...

// eg take min put 0 idx pos and at idx of 0 element swap with that element(min element)...

// Stable sort : If two elements have the same value, their original order is preserved after sorting.

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {5,4, 1,2,3};
        selection(arr);
        System.err.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0 , last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int arr[], int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int arr[] , int start , int end){
        int max = start ;
        for(int i = start ; i<=end ; i++){
            if(arr[max] < arr[i]){
                max =i;
            }
        }
        return  max;
    }
}
