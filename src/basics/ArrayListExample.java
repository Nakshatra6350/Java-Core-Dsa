package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5); //initial capacity , can only store integers because the generics which we passed is integer

//        list.add(10);
//
//        System.out.println(list); //output : [10]
//
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
//
//        System.out.print(list); //output : [10, 10, 10, 10, 10, 10, 10, 10]
//        list.set(0,99); //set 10 to 0th index but only if list has some length, otherwise it will give error
//        list.remove(0);
//        System.out.print(list.contains(10));

        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        for(int i = 0; i < 5; i++){
            System.out.print(list.get(i)); // her ewe need to use get
        }

    }
}
