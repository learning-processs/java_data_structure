package leetcode;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
       int nums []= {7,2,5,10,8};
       int k = 2;
       int nums1[] ={1,2,3,4,5};
       int k1 = 2;

       int result = splitArray(nums1, k);
       System.out.println(result);

    }
    static int splitArray(int[] nums, int k){
        int start = 0;
        int end = 0;

        for(int i = 0 ; i< nums.length ;i++){
            start = Math.max(start, nums[i]);
            end +=nums[i];
        }

        while (start < end) {
            int mid = start + (end - start)/2;

            int sum = 0;
            int pices = 1;
            for(int num : nums){
                if(sum + sum> mid){
                    sum =num;
                    pices++;
                }else { 
                    sum +=num;
                }
            }
            if(pices > k){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return end;
        
    }
}
