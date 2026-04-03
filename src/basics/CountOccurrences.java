package basics;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int findingNum = in.nextInt();
        int count = 0;
        while (num > 0){
            int rem = num%10;
            if(rem == findingNum){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
