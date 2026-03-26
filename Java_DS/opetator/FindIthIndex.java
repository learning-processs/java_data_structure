package opetator;

public class FindIthIndex {
    public static void main(String[] args) {
        int arr[] = {4, 5,10};
        int target = 10;
        System.out.println(findPos(arr , target));
    }

    static int findPos(int arr[] , int target){

        for (int index = 0; index < arr.length; index++) {
           if(( arr[index] ^ target) == 0)
            return index;
        }
        return -1;
    }
}
