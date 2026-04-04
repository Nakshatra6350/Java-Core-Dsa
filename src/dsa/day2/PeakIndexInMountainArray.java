package dsa.day2;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int target = 1;
        System.out.println(search(arr,target));
    }

    static  int search(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/ 2; //might be possible that (start + end) exceeds the range of integer and give error

            if(arr[mid + 1] < arr[mid]){
                end = mid; //may be ans, but look in left
            }else{
                start = mid + 1; // because if mid + 1 is greater than mid then there is no way mid is the ans
            }
        }

        return start;
    }
}
