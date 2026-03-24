package binarysearch;

public class BS {
    public static void main(String[] args) {
        int arr[] = {-18,-12,0,3,4,5,7,9,12};
        int target = 0;
        int ans = binSearch(arr, target);
        System.out.println("Tareget element index is : "+ ans);
    }

    static int binSearch(int arr[], int target){

        int start = 0;
        int end = arr.length - 1 ;

        while (start <= end) {
            int mid = (start + (end-start)/2);

            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
