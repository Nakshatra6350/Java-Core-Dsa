package recursion.day2;

public class PrintNToOne {
    public static void main(String[] args) {
        int num = 10;
        print(num);
    }

    static void print(int num){
        if(num < 1){
            return;
        }
        System.out.println(num);
        print(num - 1);
    }
}
