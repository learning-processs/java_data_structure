package sort;

import java.util.Arrays;

// Bubble sort , Sinking Sort , Exchange sort
// Comparison Based...
// Comparing Adjacent Element
// When 1st pass complete lagest 1st element at end.
// Ingnore the last Element when start comparison becos that are already sorted
// In 2nd Agin start from start
// Similarly..
// i j         => i counter , 1st pass complete i=1 , length go length - i (last e sorted)
// 3 1 5 4 2
// Start comparison form j , j less j-1 if yes exchange similarly
// best O(n) , worst O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = { 3,4,2,6,1};
        int arr[] = {1,2,3,4};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]){
        boolean swapped;
        // Run one to n
        for(int i = 0 ; i<arr.length ; i++){
            swapped = false;
        // for each step, max item will come at the last respective index
            for(int j = 1 ; j < arr.length - i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
