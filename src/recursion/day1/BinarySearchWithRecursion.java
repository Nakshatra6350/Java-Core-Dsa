package recursion.day1;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(searchWithRecursion(arr,target, start, end));
    }

    static int searchWithRecursion(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }

//        if(arr[mid] < target){
//            start = mid + 1;
//        }else{
//            end = mid - 1;
//        }
//
//        return searchWithRecursion(arr, target, start, end);

        //another way.

        if(arr[mid] < target){
            return searchWithRecursion(arr, target, mid + 1, end);
        }

        return searchWithRecursion(arr, target, start, mid - 1);
    }
}
