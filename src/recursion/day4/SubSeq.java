package recursion.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
        //when to apply subset pattern : pattern of taking some elements and removing some is known as subset pattern

        //method one
//        methodOneSubSeq("","abc");

        //method two
//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> ans = methodTwoSubSeq("","abc", list);
//        System.out.println(ans.toString());


        //method three
        ArrayList<String> ans = methodThreeSubSeq("","abc");
        System.out.println(ans.toString());


        //print ascii value also
        ArrayList<String> ansAscii = subseqAscii("","abc");
        System.out.println(ansAscii.toString());

    }

    static ArrayList<String>  subseqAscii(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqAscii(p + ch, up.substring(1));
        ArrayList<String> middle = subseqAscii(p + (ch + 0), up.substring(1));
        ArrayList<String> right = subseqAscii(p, up.substring(1));

        left.addAll(middle);
        left.addAll(right);
        return left;
    }

    static ArrayList<String>  methodThreeSubSeq(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = methodThreeSubSeq(p + ch, up.substring(1));
        ArrayList<String> right = methodThreeSubSeq(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> methodTwoSubSeq(String processedStr, String unProcessedStr, ArrayList<String> list){
        if(unProcessedStr.isEmpty()){
            list.add(processedStr);
            return list;
        }

        char ch = unProcessedStr.charAt(0);

        methodTwoSubSeq(processedStr + ch, unProcessedStr.substring(1), list);
        methodTwoSubSeq(processedStr, unProcessedStr.substring(1), list);

        return list;
    }

    static void methodOneSubSeq(String processedStr, String unProcessedStr){
        if(unProcessedStr.isEmpty()){
            System.out.println(processedStr);
            return;
        }

        char ch = unProcessedStr.charAt(0);

        methodOneSubSeq(processedStr + ch, unProcessedStr.substring(1));
        methodOneSubSeq(processedStr, unProcessedStr.substring(1));

    }
}
