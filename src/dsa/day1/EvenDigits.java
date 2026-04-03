package dsa.day1;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {71};
        System.out.println(checkForEvenDigits(arr));
    }

    static int checkForEvenDigits(int[] arr){

        if(arr == null || arr.length == 0){
            return 0;
        }

        int count = 0;

        for(int num : arr){
            if(hasEvenDigits(num)){
                count++;
            }
        }

        return count;
    }

    static boolean hasEvenDigits(int num){
        int digits = countDigits(num);
        return digits % 2 == 0;
    }

    static int countDigits(int num){

        if(num == 0) return 1;

//        return (int)(Math.log10(Math.abs(num))) + 1;  //this is a one line approach.

        num = Math.abs(num);

        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
