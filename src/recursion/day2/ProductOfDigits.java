package recursion.day2;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 10;
        int ans = solve(num);
        System.out.println(ans);
    }

    static int solve(int num){
        if(num % 10 == num){
            return num;
        }

        return  num % 10 * solve(num / 10);
    }
}
