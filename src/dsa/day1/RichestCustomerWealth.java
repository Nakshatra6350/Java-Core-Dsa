package dsa.day1;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,1}
        }; //ith customer has amount in jth bank , arr[i][j] is amount, now return the wealth the richest customer has -> output will be 6

        int ans = findMaxWealth(arr);
        System.out.println(ans);
    }

    static int findMaxWealth(int[][] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }

        int wealth = 0;

        for(int[] i : arr){
            int temp = 0;
            for(int j : i){
                temp = temp + j;
            }

            wealth = Math.max(wealth, temp);
        }

        return wealth;

    }
}
