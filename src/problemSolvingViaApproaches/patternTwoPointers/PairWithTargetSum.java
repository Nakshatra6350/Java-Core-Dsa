package problemSolvingViaApproaches.patternTwoPointers;

import java.util.Arrays;

public class PairWithTargetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,11,15};
        int target = 9;
        int [] ans = solve(arr, target);
        int[] arr2 = new int[]{0,1,11,15,9};
        int[] ansFromSortingArr = solveWithSorting(arr2,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ansFromSortingArr));
    }

    private static int[] solveWithSorting(int[] arr, int target) {
        int[] ans = new int[]{-1,-1};

        if(arr.length < 1){
            return ans;
        }

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                ans[0] = i;
                ans[1] = j;
                return ans;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }

        return ans;
    }

    public static int[] solve(int[] arr, int target){
        int[] ans = new int[]{-1,-1};

        if(arr.length < 1){
            return ans;
        }


        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }



        return ans;
    }
}
