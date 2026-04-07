package dsa.day4Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,6,3,9,6,2,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    static  int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }

        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int[] insertionSort(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{};
        }


        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j , j-1);
                }else{
                    break;
                }
            }
        }

        return arr;

    }
}
