package binarysearch;

public class PosInSortedInfinitArr {
    public static void main(String[] args) {
        int arr[] = { 2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target = 23;

        int result = findRange(arr, target);
        System.out.println(result);
    }

    static int findRange(int []arr, int target){
        int start = 0;
        int end =1;
        
        while(target > get(arr, end)){
            int newStart = end+1;
            end = end+(end-start+1) *2;
            start = newStart;
        }
        return binSearch(arr, target, start, end);
    }

    static int binSearch(int arr[], int target, int start,int end){

        while (start <= end) {
            int mid = (start + (end-start)/2);
            int value = get(arr, mid);

            if(target < value){
                end = mid-1;
            }else if (target > value){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int get(int[] arr , int index){
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
           return Integer.MAX_VALUE;
        }
    }
}
