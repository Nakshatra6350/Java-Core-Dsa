package recursion.day2;

public class ReverseNumber {
    static  int sum = 0;
    public static void main(String[] args) {
        int num = 1342;
        solve(num);
        System.out.println(sum);
    }

    static void solve(int num){
        if(num == 0){
            return;
        }

        int rem = num % 10;

        sum = sum * 10 + rem;

        solve(num / 10);
    }
}
