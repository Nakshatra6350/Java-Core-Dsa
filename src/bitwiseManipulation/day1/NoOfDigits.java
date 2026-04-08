package bitwiseManipulation.day1;

public class NoOfDigits {
    public static void main(String[] args) {
        //number of digits in base b of num n => int(log base b num n) + 1;

        int num = 5;
        int base = 2;

        int ans = (int)(Math.log(num) / Math.log(base)) + 1;

        System.out.println(ans);
    }
}
