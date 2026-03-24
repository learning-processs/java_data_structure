package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {18, 12 , 9 , 14, 77, 50};

        lsearch(arr, 14);

    }
    static int lsearch(int arr[] , int key){
        if(arr.length == 0){
            return -1;
        }

        for( int idx = 0 ; idx < arr.length -1 ; idx++){
            if(arr[idx]==key){
                System.out.println("Found at index : " + idx);
            }
        }
        return -1;
    }
}
