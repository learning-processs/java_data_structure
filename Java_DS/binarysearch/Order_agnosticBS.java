package binarysearch;

public class Order_agnosticBS {
    public static void main(String[] args) {
        int arr[] = { 90, 75, 18, 12, 6, 4, 3, 1 };
        int target = 1;
        int result = orderAgnostic(arr, target);
        System.out.println(result);
    }

    static int orderAgnostic(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                } 
            }else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
        }
        return -1;
    }

}
