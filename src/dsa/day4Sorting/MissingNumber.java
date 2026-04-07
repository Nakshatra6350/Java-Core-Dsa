package dsa.day4Sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {3,0,1};
        System.out.println(findNum(arr));
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

    static int findNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }
}
