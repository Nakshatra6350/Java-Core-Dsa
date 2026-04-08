package recursion.day2;

public class CountZeroes {
    static int count = 0;
    public static void main(String[] args) {
        int num = 30204;
//        solve(num);
//        System.out.println(count);

        System.out.println(count(num));
    }

//    static void solve(int num){
//        if(num == 0){
//            return;
//        }
//
//        int rem = num % 10;
//        if(rem == 0){
//            count++;
//        }
//
//        num = num / 10;
//
//        solve(num);
//    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
