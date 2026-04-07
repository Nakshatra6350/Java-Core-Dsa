package dsa.day4Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //also known as sinking sort and exchange sort
        int[] arr = {2,6,3,9,6,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
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

    static int[] selectionSort(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{};
        }


        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }

        return arr;

    }
}
