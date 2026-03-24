package LinearSearch;

public class SearchInRange {
    
    public static void main(String[] args) {
        int arr[] = { 18, 12, -7,3, 14, 28};
        int target = 14;

        System.out.println(LS(arr,target, 1, 4 ));
    }

    static int LS(int arr[] ,int target, int first , int last){
        if(arr.length == 0 ){
            return -1;
        }

        for(int i = first ; i <= last ; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
