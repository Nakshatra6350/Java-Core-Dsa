package dsa.day2;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;

        int[] ans = findElement(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findElement(int[] arr, int target){
        int[] ans = {-1, -1};

        if(arr == null || arr.length == 0){
            return ans;
        }

        ans[0] = search(arr, target, true);   // first position
        ans[1] = search(arr, target, false);  // last position

        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;

                if(findStartIndex){
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            }
        }

        return ans;
    }
}