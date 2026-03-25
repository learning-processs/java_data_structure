package opetator;

// XOR the element, why becoz when both true or false it give false, 
// if one of them is true , false it gives true.
public class NoPresentOneTime {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5, 6,5,3,4,2,1};
        System.out.println(findUnique(arr));
    }

    static int findUnique(int arr[]){
        int unique = 0 ;
        
        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
