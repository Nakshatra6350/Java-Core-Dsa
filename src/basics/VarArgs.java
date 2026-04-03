package basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //when we do not know how much inputs we are giving
        fun(1,2,3,4,5);
        fun();
    }

    static void fun(int ...v){
        //this int ...v means array of integers similarly String ...v means array of strings

        System.out.println(Arrays.toString(v));
    }
}
