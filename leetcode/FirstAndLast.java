package leetcode;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int nums[] = {5,7,7,7,7,8,8,10};
        int  target = 7;

        int result[] = FirstAndLastPosition(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] FirstAndLastPosition(int nums[] , int target){
        int [] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        if( ans[0] != 1){
            ans[1] = end;
        }

        return ans;
    }

    static int search(int nums[], int target, boolean findfirstIdx){
        int ans = -1;
        int start = 0 ; int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(findfirstIdx){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
