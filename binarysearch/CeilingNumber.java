package binarysearch;

// Smallest element in array greater or target
// e.g [2,4,5,6] targ = 4  so, Ans = 4;
// e.g [2,3,5,6] targ = 4  so, Ans = 5;
// sorted => binary Search
public class CeilingNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9, 14, 16,  18};
        int target = 19;

        int result = findCeilingNo(arr, target);
        System.out.println(result);
    }

    static int findCeilingNo(int arr[], int target){

        int start = 0; int end = arr.length-1;

        if(target > arr[arr.length -1]){
            return -1;
        }

        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid] ){
                end = mid-1;
            }else if ( target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start; // it's gonna to violet the rule then return the start..
                     // i.e.  e < s so, we retrun the s.
    }
}
