package dsa.day4Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        // Find pivot
        // What is pivot here : choose any element and after first pass, all the elements smaller than pivot should be in LHS of pivot and greater should be in RHS of pivot

        /*
            how to put pivot in correct position :
            while n[start] < pivot : start++; //no violation here
            while n[end] > pivot : end--; //no violation here
            if violation then swap.

            low and high tells which part you are working on and start and end is just for swapping
        */

        /*
            how to pick pivot :
            1. random element
            2. corner elements
            3. middle elements
        */

        int[] nums = new int[]{4,3,5,66, 3,2,1,0};
        sort(nums, 0 , nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end){
            while(nums[start] < pivot){
                start++;
            }

            while (nums[end] > pivot){
                end--;
            }

            if(start <= end){
//                swap(nums,start,end);
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        //now pivot at correct index - sort two halves

        sort(nums,low,end);
        sort(nums, start, high);


    }


}
