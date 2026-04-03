package basics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Original number: " +  num);
        int reverseNum = 0;
        while(num > 0){
            int rem = num%10;
            reverseNum = reverseNum * 10 + rem;
            num = num/10;
        }
        System.out.println("basics.Reverse Number: " + reverseNum);
    }
}
