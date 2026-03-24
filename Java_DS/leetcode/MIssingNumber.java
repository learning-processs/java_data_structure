package leetcode;



public class MIssingNumber {
    public static void main(String[] args) {
        int nums [] = {1,4,3};

        int ans = cyclicSearch(nums);
        System.out.println(ans);
    }

    static int  cyclicSearch(int arr[]){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;

            if(arr[i] < arr.length &&arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else { 
                i++;
            }
        }

        for(int idx = 0 ; idx < arr.length ; idx++){
            if(arr[idx] != idx +1){
                return idx +1;
            }
        }

        return arr.length;
    }
}
