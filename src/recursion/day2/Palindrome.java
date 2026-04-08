package recursion.day2;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcbae";
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }

    static boolean isPalindrome(String str, int start, int end){
        if (start >= end) {
            return true;
        }

        // mismatch case
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // recursive case
        return isPalindrome(str, start + 1, end - 1);
    }
}
