package dsa.day2;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1}; //output : 2
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int peakIndex = peakElement(arr, target);
        int firstTry = searchOrderAgnostic(arr, target, 0, peakIndex);
        if(firstTry != -1){
            return firstTry;
        }

        return searchOrderAgnostic(arr,target, peakIndex + 1, arr.length - 1);
    }

    static  int peakElement(int[] arr, int target){
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

    static  int searchOrderAgnostic(int[] arr, int target, int start, int end){
        if(arr == null || arr.length == 0){
            return -1;
        }

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
