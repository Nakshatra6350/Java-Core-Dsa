package recursion.day5;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));

//        ArrayList<String> ans = printPathsDiagonal("", 3, 3);
//        System.out.println(ans);

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);
    }

    static void pathRestrictions(String processed, boolean[][] board, int row, int col) {
        if(row == board.length - 1 && col == board[0].length - 1){
            System.out.println(processed);
            return;
        }

        if(!board[row][col]){
            return;
        }

//        if(row < board.length - 1 && col < board[0].length - 1){
//            pathRestrictions(processed + "D", board,row + 1, col + 1);
//        }

        if(col < board[0].length - 1){
            pathRestrictions(processed + "H", board, row, col + 1);
        }

        if(row < board.length - 1){
            pathRestrictions(processed + "V", board,row + 1, col);
        }
    }

    static ArrayList<String> printPaths(String processed, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(col > 1){
            ans.addAll(printPaths(processed + "R", row, col - 1));
        }

        if(row > 1){
            ans.addAll(printPaths(processed + "D",row - 1, col));
        }

        return ans;
    }

    static ArrayList<String> printPathsDiagonal(String processed, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1 && col > 1){
            ans.addAll(printPathsDiagonal(processed + "D",row - 1, col - 1));
        }

        if(col > 1){
            ans.addAll(printPathsDiagonal(processed + "H", row, col - 1));
        }

        if(row > 1){
            ans.addAll(printPathsDiagonal(processed + "V",row - 1, col));
        }



        return ans;
    }

    static int count(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }
}
