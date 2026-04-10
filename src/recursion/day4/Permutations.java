package recursion.day4;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abcd";
//        printPerm("",str);
        ArrayList<String> ans = printPermList("", str);
        System.out.println(ans);
        int count = printPermCount("", str);
        System.out.println(count);
    }

    static void printPerm(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        for(int i = 0 ; i <= processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());

            String s = first + ch + second; //don't mutate processed directly, either create a new variable or pass it directly
            printPerm(s, unProcessed.substring(1));
        }
    }

    static ArrayList<String> printPermList(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0 ; i <= processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());

            String s = first + ch + second; //don't mutate processed directly, either create a new variable or pass it directly
            ans.addAll(printPermList(s, unProcessed.substring(1)));
        }

        return ans;
    }

    static int printPermCount(String processed, String unProcessed){
        if(unProcessed.isEmpty()){
            return 1;
        }

        char ch = unProcessed.charAt(0);
        int ans = 0;
        for(int i = 0 ; i <= processed.length(); i++){
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());

            String s = first + ch + second; //don't mutate processed directly, either create a new variable or pass it directly
            ans = ans + printPermCount(s, unProcessed.substring(1));
        }

        return ans;
    }
}
