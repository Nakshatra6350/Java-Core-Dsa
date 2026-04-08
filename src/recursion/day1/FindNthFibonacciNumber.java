package recursion.day1;

public class FindNthFibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findNum(n));
    }

    static int findNum(int n){
        if(n < 2){
            return n;
        }

        return findNum(n-1) + findNum(n-2);
    }
}
