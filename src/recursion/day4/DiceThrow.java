package recursion.day4;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        int target = 4;
//        print("",target);

        ArrayList<String> ans = new ArrayList<>();
        System.out.println(getList("",target));
    }

    static ArrayList<String> getList(String processed, int target) {
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(getList(processed + i, target - i));
        }

        return  ans;
    }

    static void print(String processed, int target){
        if(target == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++){
            print(processed + i, target - i);
        }
    }
}
