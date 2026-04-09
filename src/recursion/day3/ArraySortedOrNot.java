package recursion.day3;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2, 43,3,4,5};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index){

        if(index == arr.length - 1){
            return  true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
