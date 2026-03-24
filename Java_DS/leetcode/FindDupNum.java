package leetcode;

public class FindDupNum {

    public static void main(String[] args) {
        // int arr[] = { 1, 3, 4, 2, 2 };
        int arr[] = {3,1,3,4,2};
        // int arr[] = {3,3,3,3,3};

        int ans = cyclicSort(arr);
        System.out.println(ans);
    }

    static int cyclicSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }

        }
        return -1;
    }
}
