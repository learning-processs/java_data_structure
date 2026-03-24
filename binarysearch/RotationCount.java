package binarysearch;

public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,0,1,2,3};
        System.out.println((countRotation(arr)));
    }
    static int countRotation(int arr[]){
        int pivote  = findPivoteInDup(arr);
        return pivote+1;

    }

    static int findPivoteInDup(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Four Cases..
            // 1.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // 2.
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // 3.
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
