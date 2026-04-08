package bitwiseManipulation.day1;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        //reverse each row means flip horizontally and invert means replace 0 by 1 and 1 by 0.

        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        flip(arr);
    }

    static int[] swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return arr;
    }

    static int[] reverseRow(int[] arr){
        if(arr == null || arr.length == 0){
            return new int[]{};
        }
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            arr = swap(arr,start,end);
            start++;
            end--;
        }

        return arr;
    }

    static void flip(int[][] arr){

        //approach one
//        int rows = arr.length;
//        int cols = arr[0].length;
//
//        for(int i = 0; i < rows; i++){
//            arr[i] = reverseRow(arr[i]);
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = arr[i][j] == 0 ? 1 : 0;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));


        //approach two

//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            int start = 0;
//            int end = arr[i].length - 1;
//
//            while (start <= end) {
//                // swap + invert
//                int temp = arr[i][start] ^ 1;
//                arr[i][start] = arr[i][end] ^ 1;
//                arr[i][end] = temp;
//
//                start++;
//                end--;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(arr));

        //approach three

        for(int[] row : arr) {
            // reverse this array
            for (int i = 0; i < (arr[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length - i - 1] ^ 1;
                row[arr[0].length - i - 1] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
