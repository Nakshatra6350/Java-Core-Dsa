package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your roll no: ");
        int rollNo = input.nextInt();
        System.out.println("your roll no: " + rollNo);
        float marks = input.nextFloat();
        System.out.println("your marks: " + marks);
    }
}
