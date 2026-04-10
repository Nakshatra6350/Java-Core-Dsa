package recursion.day4;

public class RemoveTargetElementFromString {
    public static void main(String[] args) {
//        skip("","bacapplcdah");
        System.out.println(skip("bacapplcdah"));

//        System.out.println(skipAppNotApple("bacapplcdah"));
    }

    static void skip(String ans, String inputStr) {
        if (inputStr.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = inputStr.charAt(0);

        if (ch == 'a') {
            skip(ans, inputStr.substring(1));
        } else {
            skip(ans + ch, inputStr.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
