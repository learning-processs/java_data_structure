package leetcode;

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {0,10,6,4,2,0};
        int arrr[] = {0,2,3,4, 1};

        int result = peakIndexInMountainArray(arrr);
        System.out.println(result);

    }

   static int peakIndexInMountainArray(int []arr){
        int start = 0; int end = arr.length-1;

        while (start < end) {
            int mid = (start + (end-start)/2);

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start =  mid+1;
            }
        }
        return start;
   }
}
