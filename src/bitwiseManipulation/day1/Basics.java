package bitwiseManipulation.day1;

public class Basics {
    public static void main(String[] args) {
        // When you & 1 with any number, digits remain same, e.g : 110010100 & 111111111 => 110010100
        // OR -> any one value is true then it is true
        // XOR (^) -> if and only if (exclusive or) ->  0^0 -> 0, 0 ^ 1 / 1 ^ 0 -> 1, 1 ^ 1 -> 0
        // a ^ 1 = !a ( a bar / complement of a), a ^ 0 = a, a ^ a = 0

        //Decimal -> 0,1,2,3,4,5.....9 Base - 10
        //Binary -> 0,1       Base - 2
        //Octal -> 0,1,2,3,4,5.....7 Base - 8
        //Hexadecimal -> 0,1,2,3,4,5.....9, A, B,....F Base - 16
        // eg: 10 in decimal = 1010 in binary, 12 in octal, A in hexadecimal



        /*
        * conversions
        * Decimal to base b -> keep dividing by base, take remainders and write in opposite
        * e.g : convert decimal 17 to base 2
        *       17/2 = 8 , rem : 1
        *       8/2 = 4, rem : 0
        *       4/2 = 2, rem : 0
        *       2/2 = 1, rem: 0
        *       final o/p = 10001 (from last)
        *
        *
        * Base b to decimal -> multiply and add the power of base with digits (starting from end)
        * e.g : convert 10001 base 2 to decimal
        *       2^0 * 1 + 2^1 * 0 + 2^2 * 0 + 2^3 * 0 + 2^2 * 1 = 17 ( ^ = power)
        *
        *
        * */



        /*
        * left shift operator(<<)
        * a << 1 = 2a (IMPORTANT)
        * a << b = a * 2^b ( ^ = power)
        * 10 in decimal = 1010 in binary
        * 10 << 1 -> 1010 << 1 -> left shift every bit and assign 0 to last empty place -> 10100 => 20
        * */



        /*
         * right shift operator(>>)
         * a >> b = a / 2^b ( ^ = power)
         *
         * 0011001 >> 1 -> 001100 -> right shift every bit and ignore last.
         * */



        //Question 1 : find the number is odd or even
//        boolean isEven = checkNumberIsOddOrEven(9);
//        if(isEven){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

        //Question 2 : in an array every number appear once only one number is appearing twice, find the number
//        int[] arr = {2,3,4,5,6,7};
//
//        System.out.println(findDuplicate(arr));

        //Question 3 : in an array every number appear twice only one number is appearing once, find the number
//        int[] arr = {2,2,3,3,4,4,5,5,6,7,7};
//
//        System.out.println(findSingle(arr));


        //Question 4 : find nth magic number
        int num = 6;
        int base = 5;
        System.out.println(findMagicNo(num, base));
    }

    static boolean checkNumberIsOddOrEven(int n){
        return (n & 1) == 0;
    }

    static  int findDuplicate(int[] arr){
        if(arr == null || arr.length == 0){
            return  -1;
        }
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if((arr[i] ^ arr[j]) == 0){
                return arr[i];
            }

            i++;
        }

        return  -1;
    }

    static  int findSingle(int[] arr){
        if(arr == null || arr.length == 0){
            return  -1;
        }
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans = ans ^ arr[i];
        }

        return  ans;
    }

    static int findMagicNo(int n, int base) {
        int ans = 0;
        int initalBase = base;

        while (n > 0) {
            int lsb = n & 1;
            n = n >> 1;

            ans += lsb * base;

            base = base * initalBase;

        }

        return ans;
    }

}
