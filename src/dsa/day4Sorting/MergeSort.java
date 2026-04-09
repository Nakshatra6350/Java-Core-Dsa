package dsa.day4Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        //divide array into two parts, get both parted sorted via recursion, and then merge te sorted parts
        int[] arr = new int[]{8,3,4,12,5,6};

//        System.out.println(Arrays.toString(sort(arr)));
        sortInPlace(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{};
        }

        return mergeSort(arr);
    }

    static void sortInPlace(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }

        mergeSortInPlace(arr, 0, arr.length);
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] left, int[] right){
        int[] res = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;
            }else{
                res[k] = right[j];
                j++;
            }

            k++;
        }

        //it may be possible one of the arrays is not finished then copy the remaining elements
        while (i < left.length){
            res[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    static void mergeSortInPlace(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] res = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                res[k] = arr[i];
                i++;
            }else{
                res[k] = arr[j];
                j++;
            }

            k++;
        }

        //it may be possible one of the arrays is not finished then copy the remaining elements
        while (i < mid){
            res[k] = arr[i];
            i++;
            k++;
        }

        while (j < end){
            res[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0 ; l < res.length; l++){
            arr[start+l] = res[l];
        }
    }

}
