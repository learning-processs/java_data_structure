package rec_Array;

public class RotatedBS {
    public static void main(String[] args) {
        int arr[] = { }
    }

    static int search(int arr[] ,int target, int s ,int e){

        if(s > e){
            return -1;
        }

        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
    }
}
