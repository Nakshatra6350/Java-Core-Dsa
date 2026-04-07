package dsa.day4Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //also known as sinking sort and exchange sort
        int[] arr = {2,6,3,9,6,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{};
        }

        boolean isSwapped;

        for(int i = 0; i < arr.length; i++){
            isSwapped = false;
            for(int j = 1; j < arr.length - i; j++){ //or j <= arr.length - i - 1
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }

            if(!isSwapped) break;
        }

        return arr;

    }
}
