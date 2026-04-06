package Rec_subsets_subsequence_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetDup {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };

        List<List<Integer>> ans = subsetDup(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDup(int arr[]) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // New Empty list is added
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) { // Every no. in my array create list equal to size of existing array;
                                               // outer size = same list created
            start = 0;
            // if current and prev element is same s = e + 1;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
