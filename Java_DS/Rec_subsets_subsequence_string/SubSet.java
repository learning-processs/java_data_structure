package Rec_subsets_subsequence_string;

import java.util.ArrayList;
import java.util.List;
// Time Complexity -> O(N * 2^N)
// Space Complexity -> O(2^N * N)
public class SubSet {
    public static void main(String[] args) {
        int arr[] = { 1,2,3};

        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int arr[]){
         List<List<Integer>> outer = new ArrayList<>();

         outer.add(new ArrayList<>()); // New Empty list is added

         for(int num : arr){       // Every no. in my array create list equal to size of existing array ;outer size = same list created
            int n = outer.size();
            for(int i = 0 ; i < n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
