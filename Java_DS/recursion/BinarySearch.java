package recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 5, 7, 8};
        int target = 7;

        int result = search(arr, target, 0,  arr.length - 1);
        System.out.println(result);
        
    }

    static int search(int arr[] , int target , int s ,int e){
       if( s > e){
        return -1;
       }

       int m = s + (e-s)/2;

       if(arr[m] == target){
            return m;
       }

       if(target < arr[m]){
           return search(arr, target, s,  m-1); // if return type , return the value
       }
        return search(arr, target, m+1, e);
  
    }
}
