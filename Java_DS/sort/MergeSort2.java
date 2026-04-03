package sort;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int arr [] = { 8, 3, 4, 12,5,6};
        mergeSort(arr, 0, arr.length );
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int arr[] , int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = s + (e-s)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        merged(arr, s,mid, e);
    }
    static void merged(int arr[] , int s ,int m ,int e){

        int mix []= new int[e -s];
        int i = s;
        int j = m;
        int k = 0;

        while( i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int rand = 0; rand < mix.length ; rand++){
            arr[s+rand] = mix[rand];
        }
    }
}
