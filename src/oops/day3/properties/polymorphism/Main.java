package oops.day3.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        Circle circle = new Circle();
//        Square square = new Square();
//        Triangle triangle = new Triangle();
//
//        shape.area();
//        circle.area();
//        square.area();
//        triangle.area();

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();


        /*
        * In above example it is something like
        * Parent obj = new Child(); -> determines which method will be called depends on type of child , known as Upcasting
        * reference type decides which one to access
        * this entire things explains how overriding works
        * */
    }
}
