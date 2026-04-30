package problemSolvingViaApproaches.patternTwoPointers;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,2,2,3,3,3,3,4,4,5};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void solve(int[] nums){
        if(nums.length <= 1){
            return;
        }

        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
    }
}
