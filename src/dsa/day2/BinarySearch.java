package dsa.day2;

public class BinarySearch {
    public static void main(String[] args) {
        //first condition which needs here is a sorted array, this is must for this algorithm
        // in linear search worst condition is o(n), so that's why this came here
        //Time complexity -> o(logN)
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        System.out.println(search(arr,target));
    }

    static  int search(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/ 2; //might be possible that (start + end) exceeds the range of integer and give error

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
