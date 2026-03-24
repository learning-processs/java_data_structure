package leetcode;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        int result = search(nums, target);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }

    static int search(int nums[], int target) {

        int pivote = findPivote(nums);
        if (pivote == -1) {
            return binrySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivote] == target) {
            return pivote;
        }
        if (target >= nums[0]) {
            return binrySearch(nums, target, 0, pivote - 1);
        }
        return binrySearch(nums, target, pivote + 1, nums.length - 1);
    }

    static int binrySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // No Duplicate values...
    static int findPivote(int arr[]) {
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
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    // Duplicate values...
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
