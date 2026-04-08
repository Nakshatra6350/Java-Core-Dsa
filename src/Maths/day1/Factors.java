package Maths.day1;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        printFactors(n);
        printFactorsSecond(n);
        factors3(n);
    }

    // O(n)
    static void printFactors(int num){
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }

    // O(sqrt(n))
    static void printFactorsSecond(int num){
        for (int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(num / i == i){
                    System.out.println(i);
                }else{
                    System.out.println(i + " " + num/i + " ");
                }

            }
        }
    }

    // both time and space with be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
