package basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum(); //calling the function here
//        int ans = sum2();
//        System.out.println("basics.Sum of numbers: " + ans);
        int ans = passingParamSum(10,20); //in java there is no pass by reference, there will always be only pass by value -> copy of reference is passed
        System.out.println("basics.Sum of numbers: " + ans);
    }
    static int passingParamSum(int num1, int num2){
        return num1 + num2;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        return num1 + num2;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("basics.Sum of numbers: " + sum);
    }
}
