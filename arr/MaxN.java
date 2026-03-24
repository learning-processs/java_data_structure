package arr;

public class MaxN {
    public static void main(String[] args) {
         int [] arr = {1,3,4,7, 10};
         System.out.println(max(arr));
         System.out.println(maxinRange(arr , 1 , 3));
    }
    static int max(int arr[]){
        if( arr.length == 0){
             return -1;
        }

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max  ){
                max=arr[i];
            }
        }
        return max;
    }


    static int maxinRange(int arr[] , int index1 ,int index2){

        if( arr == null){
             return -1;
        }
        int max = arr[index1];

        for(int i = index1 ; i <= index2 ; i++){
            if(arr[i] > max  ){
                max=arr[i];
            }
        }
        return max;
    }
}