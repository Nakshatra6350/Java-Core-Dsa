package recursion.day2;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1342;
        int ans = solve(num);
        System.out.println(ans);
    }

    static int solve(int num){
        if(num == 0){
            return 0;
        }

        return  num % 10 + solve(num / 10);
    }
}
