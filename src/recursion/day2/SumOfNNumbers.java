package recursion.day2;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int num = 5;
        int ans = solve(num);
        System.out.println(ans);
    }

    static int solve(int num){
        if(num <= 1){
            return 1;
        }

        return num + solve(num - 1);
    }
}
