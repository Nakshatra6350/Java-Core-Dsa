package dsa.day3;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{11,25,35,45}, {28,29,37,49}};
        int target = 100;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] nums, int target) {
        int row = 0;
        int col = nums.length - 1;

        while(row < nums.length && col >= 0){
            if(nums[row][col] == target){
                return new int[]{row,col};
            }

            if(nums[row][col] < target){
                row++;
            }else{
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}



