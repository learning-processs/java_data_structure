package binarysearch;
import java.util.Arrays;

// Take middle Element , perform the binarysearch on middleElement

public class TwoD_SortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 15;
        System.out.println(Arrays.toString(search(arr, target)));
    };

    // Reduce the search space applying the BS on middle element
    static int[] binSearch(int matrix[][],int row , int cStart , int cEnd, int target){

        while (cStart <= cEnd) {
            int mid = (cStart + (cEnd-cStart)/2);

           if(matrix[row][mid] == target){
            return new int[] {row,mid};
           }
           if(matrix[row][mid] <target){
            cStart = mid+1;
           }else{
            cEnd = mid-1;
           }
        }
        return new int[]{-1,-1};
    }

    // 2 Remaining Rows

    static int[] search(int[][] matrix , int target){
        int rows= matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binSearch(matrix, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd-1)) {
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        // now we have two rows;

        // target in middle
         if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart +1][cMid] == target){
            return new int[]{rStart+1, cMid};
        }
        //search in 1st half
        if(target <= matrix[rStart][cMid-1]){
            binSearch(matrix, rStart, 0, cMid-1, target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cMid+1] && target <=matrix[rStart][cols-1] ){
            binSearch(matrix, rStart, cMid+1, cols-1, target);
        }
        //search in 3rd half
        if(target <= matrix[rStart+1][cMid-1]){
            binSearch(matrix, rStart+1, 0, cMid-1, target);

        }
        //search in 4th half
        if(target >= matrix[rStart+1][cMid-1]){
            binSearch(matrix, rStart+1, cMid+1, cols-1, target);
            
        }
        return new int[]{-1,-1};
        
    }
}
