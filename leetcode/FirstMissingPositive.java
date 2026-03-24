package leetcode;

// Ignore the -ve Numbers...
public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums [] = { 1,2,0 };
        // int nums [] = {3,4,-1,1};
    }

    static int cyclicSort(int nums[]){
        int i = 0;
        while (i < nums.length) {
            
            int correctIndex = nums[i]-1;
            if(nums[i] > 0  && nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }

        }

        for(int idx = 0 ; idx < nums.length ; idx++){
            if(nums[idx] != idx+1){
                return idx+1;
            }
        }

        return nums.length + 1;
    }
}
