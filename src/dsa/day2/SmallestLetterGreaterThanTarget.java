package dsa.day2;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        //return smallest char from array which is larger than target
        char[] arr = {'c', 'd', 'e'};
        char target = 'd';
        char ans = findElement(arr,target);
        System.out.println(ans);
    }

    static  char findElement(char[] arr, char target){

        int start = 0;
        int end = arr.length - 1;
        int index = 0;
        while(start <= end){
            int mid = start + (end - start)/ 2; //might be possible that (start + end) exceeds the range of integer and give error

            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return arr[start % arr.length] ;
    }
}
