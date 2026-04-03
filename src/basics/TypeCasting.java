package basics;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        int num = input.nextInt();
//        System.out.println(num);
        //casting
//        int num2 = (int)(77.44f);
//        System.out.println(num2);

        //automatic type promotion in expressions
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c; // in this 40*50 gives 2000 which exceeds the byte capacity of -128 to 127 hence, java automatically promoting its type

        System.out.println(d);

        //all the byte, short and char are promoted to int
        //if any one of the operand is long then whole expression converted to long, if float then float, if double then double
    }
}
