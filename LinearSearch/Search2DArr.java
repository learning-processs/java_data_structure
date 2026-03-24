package LinearSearch;

import java.util.Arrays;

public class Search2DArr {
    public static void main(String[] args) {
        int [][] arr = {
            {35, 2, 1},
            {6, 12, },
            {9, 2, 4},
        };
        int target = 4;

        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.print("MAXIMUM VALUE..");
        System.out.println(max(arr));

        System.out.print("MINIMUM VALUE..");
        System.out.println(min(arr));

    }

    static int min(int arr[][]){
        int min = Integer.MAX_VALUE;

        for(int ints[] : arr){
            for(int elements : ints){
                if(elements < min){
                    min = elements;
                }
            }
        }
        return min;
    }
    
    static int max(int arr[][]){
        int max = Integer.MIN_VALUE;

        for(int ints[] : arr){
            for(int elements : ints){
                if(elements > max){
                    max = elements;
                }
            }
        }
        return max;
    }


    static int[] search(int arr[][], int target){
        for(int row = 0 ; row < arr.length ; row++ ){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
};
