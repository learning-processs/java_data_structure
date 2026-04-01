package rec_Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
       int arr[] = {1, 3, 4, 5, 3, 8, 8};
       int target = 8;


        System.out.println(linearSearch(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findFromLastIndex(arr, target, arr.length - 1));
        findAllIndex(arr, target, 0);
        System.out.println(list);

        ArrayList<Integer>result = findAllIndex2(arr, target, 0 ,new ArrayList<>());
        System.out.println(result);

        ArrayList<Integer>result1 = findAllIndex3(arr, target, 0 );
        System.out.println(result1);
    }



    static boolean linearSearch(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }




    static int findIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }


    
    static int findFromLastIndex(int arr[], int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return findFromLastIndex(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }




    static ArrayList<Integer> findAllIndex2(int arr[], int target, int index , ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index + 1 ,list);
    }




     static ArrayList<Integer> findAllIndex3(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);
        return list;
    }




}
