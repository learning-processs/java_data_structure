package sort;

import java.util.Arrays;

// Divide and conquer 
// Divide in 2 parts
// sort the first half and sort the 2nd half
// & then Merge the both
// take two pointer in both sorted array and then compare which one is 
// smaller put the 1st and the move the pointer similarly..all
public class MergeSort {
    public static void main(String[] args) {
        int arr [] = { 8, 3, 4, 12,5,6};
        System.out.println(Arrays.toString(arr));
    }

    static int [] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid)) ; //Copy the sepcified range in new Array
        int[] right = mergeSort(Arrays.copyOfRange(arr , mid , arr.length));

        return merge(left, right);
    }

    static int [] merge(int left[] , int [] right){
        int [] newArray = new int[left.length + right.length];
        int i = 0;  // For left
        int j = 0;  // For right
        int k = 0;  // For merged Array

        while (i < left.length && j < right.length) {
            if(left[i] < right[j]){
                newArray[k] = left[i];
                i++;
            }else{
                newArray[k] = right[j];
                j++;
            }
            k++;
        }

        // it may be possible one of them is not finish
        // so, Add all elecment
        while (i < left.length) {
            newArray[k] = left[i];
            i++;
            k++;
        }
         while (j < right.length) {
            newArray[k] = right[j];
            j++;
            k++;
        }
        return newArray;
    }
}
