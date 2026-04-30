package problemSolvingViaApproaches.patternTwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(-1);
        arr.add(0);
        arr.add(3);
        arr.add(10);
        ArrayList<Integer> ans = solve(arr);
        System.out.println(ans);
    }


    public static ArrayList<Integer> solve(ArrayList<Integer> nums){
        if(nums.isEmpty()) return nums;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                neg.add(num * num);
            } else {
                pos.add(num * num);
            }
        }

        Collections.reverse(neg);

        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < pos.size() && j < neg.size()){
            if(pos.get(i) < neg.get(j)){
                ans.add(pos.get(i));
                i++;
            } else {
                ans.add(neg.get(j));
                j++;
            }
        }

        while(i < pos.size()){
            ans.add(pos.get(i));
            i++;
        }

        while(j < neg.size()){
            ans.add(neg.get(j));
            j++;
        }

        return ans;
    }
}
