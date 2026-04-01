package rec_Array;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0 , 1};
        System.out.println(sortedArray(arr, 0));
    }

    static boolean sortedArray(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && sortedArray(arr, i + 1);

    }
}
