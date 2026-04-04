package dsa.day2;

public class PositionOfElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        System.out.println(findStartAndEnd(arr, target));
    }

    static int findStartAndEnd(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > get(arr, end)) {
            int temp = end + 1;
            end = end + ((end - start + 1) * 2);
            start = temp;
        }

        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/ 2;

            int value = get(arr, mid);

            if(target < value){
                end = mid - 1;
            }else if(target > value){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    // 🔥 This simulates infinite array
    static int get(int[] arr, int index){
        if(index >= arr.length){
            return Integer.MAX_VALUE; // treat as infinity
        }
        return arr[index];
    }
}