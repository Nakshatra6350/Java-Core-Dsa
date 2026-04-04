package dsa.day2;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        //first condition which needs here is a sorted array, this is must for this algorithm
        // in linear search worst condition is o(n), so that's why this came here
        //Time complexity -> o(logN)
        int[] aescArr = {1,2,3,4,5,6,7,8,9};
        int[] descArr = {9,8,7,6,5,4,3,2,1};
        int target = 1;
        System.out.println(searchOrderAgnostic(aescArr,target));
        System.out.println(searchOrderAgnostic(descArr,target));
    }

    static  int searchOrderAgnostic(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] <= arr[end];

        while(start <= end){
            int mid = start + (end - start)/ 2; //might be possible that (start + end) exceeds the range of integer and give error

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
