package dsa.day4Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        //main condition is that elements should be from 1 to N
        int[] arr = {3,4,5,1,2};
        System.out.println(Arrays.toString(cyclicSort(arr)));
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

    static int[] cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i , correctIndex);
            } else {
                i++;
            }
        }

        return arr;

    }
}
