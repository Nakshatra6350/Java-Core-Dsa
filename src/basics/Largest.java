package basics;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your inputs : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Your entered inputs are : " + num1 + ", " + num2 + ", " + num3);
        int res = Math.max(num1,Math.max(num2, num3));
        System.out.println("basics.Largest number is : " + res);
    }
}
