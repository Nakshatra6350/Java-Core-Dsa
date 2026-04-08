package bitwiseManipulation.day1;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(check(n));
    }

    static boolean check(int n){
        //approach 1
//        while (n > 0){
//            if ((n & 1) == 0){
//                n = n >> 1;
//            }else{
//                break;
//            }
//        }
//
//        return n == 1;



        //approach 2

        return n > 0 && (n & (n -1)) == 0;
    }
}
