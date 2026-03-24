package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNoArray {
    public static void main(String[] args) {
        // int nums [] = {4,3,2,7,8,2,3,1};
        int nums [] = { 1,1};

        List<Integer> ans = cyclic(nums);
        System.out.println(ans);
    }

    static List<Integer> cyclic(int nums[] ){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] -1;

            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int idx = 0 ; idx < nums.length ; idx++){
            if(nums[idx] != idx + 1){
                list.add(idx + 1);
            }
        }
        return list;
    }
}
