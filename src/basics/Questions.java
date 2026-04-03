package basics;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        //question 1
//        boolean checkForPrime = isPrime(num);
//        if(checkForPrime){
//            System.out.println("Given number is a prime number");
//        }else{
//            System.out.println("Given number is not a prime number");
//        }

        //question 2
        boolean checkForThreeDigitArmstrong = isThreeDigitArmstrong(num);
        if(checkForThreeDigitArmstrong){
            System.out.println("Given number is an armstrong number");
        }else{
            System.out.println("Given number is not an armstrong number");
        }
    }

    static boolean isThreeDigitArmstrong(int num){
        if(num < 0){
            return false;
        }
        int ans = 0;
        int comparedValue = num;
        while(num > 0){
            int rem = num % 10;
            ans =  ans + (rem*rem*rem);
            num = num/10;
        }

        return ans == comparedValue;
    }

    static boolean isPrime(int num){
        int start = 2;
        if(num < start){
            return false;
        }

        while(start * start <= num){
            if(num % start == 0){
                return false;
            }

            start++;
        }

        return start * start > num;
    }
}
