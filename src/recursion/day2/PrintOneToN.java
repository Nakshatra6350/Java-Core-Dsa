package recursion.day2;

public class PrintOneToN {
    public static void main(String[] args) {
        int num = 10;
        print(num);
    }

    static void print(int num){
        if(num < 1){
            return;
        }

        print(num - 1);

        System.out.println(num);
    }
}
