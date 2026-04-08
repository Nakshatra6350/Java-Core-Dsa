package bitwiseManipulation.day1;

public class CountNoOfSetBits {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(count(num));
    }

    static int count(int n){

        //approach one
//        int ans = 0;
//        while (n > 0){
//            if((n & 1) == 1){
//                ans++;
//            }
//            n = n >> 1;
//        }
//
//        return ans;

        //approach two
        int ans = 0;

        while (n > 0) {
            n = n & (n - 1);
            ans++;
        }

        return ans;
    }
}
