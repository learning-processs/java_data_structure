package arr;

import java.util.Arrays;
import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // int [][]arr = new int[3][0];      syntax

    /*     
        int [][]arr2D = {
            {1,2,3},        // 0 index
            {4,5},          // 1 index
            {6,7,8,9,0},    // 2 index
        };
    */
        
       int arr2D[][] = new int[3][2] ;
        // input 
        for(int row = 0 ; row < arr2D.length ; row++){
            for(int col = 0 ; col < arr2D[row].length ; col++){
                arr2D[row][col] = in.nextInt();
            }
        }

        // 1. Output
    /*
        for(int i = 0 ; i< arr2D.length ; i++){
            for(int j = 0 ; j<arr2D[i].length ; j++){
                System.out.print(arr2D[i][j] +" ");
            }
            System.out.println();
        }
     */
         // 2. Output
        for(int i = 0 ; i< arr2D.length ; i++){
           System.out.println(Arrays.toString(arr2D[i]));
        }
    }
}
