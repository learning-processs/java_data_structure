package leetcode;

import java.util.ArrayList;
import java.util.List;

// One is Missing and one is repeating...
public class FindAllDupInArray {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // int nums[] = [1];

        List<Integer> ans = cyclicSort(nums);
        System.out.println(ans);
    }

    static List<Integer> cyclicSort(int nums[]) {

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();

        for(int idx = 0 ; idx < nums.length ; idx++){
            if(nums[idx] != idx+1){
                list.add(nums[idx]);  // dup Number
                list.add(idx+1);      // Missing Number

            }
        }

        return list;
    }
}
