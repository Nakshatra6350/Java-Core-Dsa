package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        //datatype[] variable_name = new datatype[size];
        //all the values datatypes should be same

//        int[] rollNos = new int[5];
//        int[] rollNos2 = {1,2,3,4,5};
//
//        int[] ros; //declaration of array, ros is getting defined in stack in compile time
//        ros = new int[5]; //initialisation, object is created here in heap memory in run time -> dynamic memory allocation

        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.println(j); //j represents elements of arr
//        }
//
//        System.out.println(Arrays.toString(arr));

//        int[][] arr = new int[3][]; //number of columns not necessary to provide/specify but number of rows are mandatory
//        int[][] arr2 = {
//                {1,2,3},
//                {4,5,6}
//        };
//

        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();

            System.out.println(Arrays.toString(arr[row]));
        }



    }
}
