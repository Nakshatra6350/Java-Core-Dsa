package basics;

public class Shadowing {
    static int x = 90; //this x is always be available to every block inside this class
    // this above x will be shadowed at line 6 because lower level is overriding the upper level
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 40;
        System.out.println(x); //40
        fun();
    }

    static void fun(){
        System.out.println(x); //90
    }
}
