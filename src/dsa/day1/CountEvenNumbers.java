package dsa.day1;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,6,6,6};
        int ans = countEvens(arr);
        System.out.println(ans);
    }

    static int countEvens(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int count = 0;

        for(int i : arr){
            if(i % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
