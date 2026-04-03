package dsa.day1;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        // Time complexity : best -> o(1) , worst -> o(n)
        int[] arr = {14,22,55,2,4,21,211};
        int target = 0;
        int ans = linearSearch(arr, target);
        System.out.println("Index : " + ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
