package recursion.day5;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        allPaths("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathsAndMatrix("", board, 0, 0, path, 1);
    }

    static void allPaths(String processed, boolean[][] board, int row, int col) {
        if(row == board.length - 1 && col == board[0].length - 1){
            System.out.print(processed + " ");
            return;
        }

        if(!board[row][col]){
            return;
        }

        //marking false, means I have tracked this in my current path
        board[row][col] = false;

        if(col < board[0].length - 1){
            allPaths(processed + "R", board, row, col + 1);
        }

        if(row < board.length - 1){
            allPaths(processed + "D", board,row + 1, col);
        }

        if(row > 0){
            allPaths(processed + "U", board,row - 1, col);
        }

        if(col > 0){
            allPaths(processed + "L", board,row, col - 1);
        }


        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        // this is backtracking here, mark it again true.
        board[row][col] = true;

    }

    static void allPathsAndMatrix(String processed, boolean[][] board, int row, int col, int[][] path, int step) {
        if(row == board.length - 1 && col == board[0].length - 1){
            path[row][col] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if(!board[row][col]){
            return;
        }


        //marking false, means I have tracked this in my current path
        board[row][col] = false;

        path[row][col] = step;

        if(col < board[0].length - 1){
            allPathsAndMatrix(processed + "R", board, row, col + 1, path, step + 1);
        }

        if(row < board.length - 1){
            allPathsAndMatrix(processed + "D", board,row + 1, col, path, step + 1);
        }

        if(row > 0){
            allPathsAndMatrix(processed + "U", board,row - 1, col, path, step + 1);
        }

        if(col > 0){
            allPathsAndMatrix(processed + "L", board,row, col - 1, path, step + 1);
        }


        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        // this is backtracking here, mark it again true.
        board[row][col] = true;

        path[row][col] = 0;

    }
}

