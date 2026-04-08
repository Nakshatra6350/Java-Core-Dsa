package bitwiseManipulation.day1;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        System.out.println(solve(base, power));
    }

    static int solve(int base, int power){
        int ans = 1;
        while (power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            power = power >> 1;
            base *= base;
        }

        return ans;
    }
}
