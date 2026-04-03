package dsa.day1;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int start = 8;
        int end = 5;
        int target = 10;
        System.out.println(search(arr,start,end,target));
    }

    static boolean search(int[] arr, int start, int end, int target){
        if (arr == null || arr.length == 0) {
            return false;
        }

        if (start > end) {
            return false;
        }

        // Clamping the values to not create a failure.
        if (start < 0) start = 0;
        if (end >= arr.length) end = arr.length - 1;

        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }
}
