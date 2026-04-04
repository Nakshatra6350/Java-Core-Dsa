package dsa.day2;

public class CeilingOfNumber {
    public static void main(String[] args) {
        //ceiling of a number is in this array find the smallest element in the array which greater or equal to target
        int[] arr = {2,3,5,9,14,16,18}; //here the answer will 5
        int target = 15;
        int ans = findElement(arr,target);
        System.out.println(ans);
    }

    static  int findElement(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int index = 0;
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

        return start;
    }
}
