package recursion.day4;

import java.util.ArrayList;

public class LetterCombinationsOfPhoneNumber {

    static String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public static void main(String[] args) {

        String str = "23";
//        printComb("",str);
        ArrayList<String> ans = solve("",str);
        System.out.println(ans);
    }

    static void printComb(String processed, String unProcessed){

        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unProcessed.charAt(0) - '0'; // convert '2' into 2

        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++){

            char ch = letters.charAt(i);
            printComb(processed + ch, unProcessed.substring(1));
        }

    }

    static ArrayList<String> solve(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = unProcessed.charAt(0) - '0'; // convert '2' into 2
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++){

            char ch = letters.charAt(i);
            ans.addAll(solve(processed + ch, unProcessed.substring(1)));
        }

        return ans;
    }
}
