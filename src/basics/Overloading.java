package basics;

public class Overloading {
    public static void main(String[] args) {
        int ans = fun(10);
        fun("nakshatra");

        //when two functions have same name, but different arguments
    }

    static int fun(int a){
        System.out.println("function one : " + a);
        return a;
    }

//    static void fun(int a){
//        System.out.println("function one : " + a);
//    }

    static void fun(String name){
        System.out.println("function two : " + name);
    }
}
