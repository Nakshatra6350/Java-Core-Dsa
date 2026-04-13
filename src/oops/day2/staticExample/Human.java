package oops.day2.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // property not related to any object but are common to all the objects, we declare those as static

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here because this is a static method and this represents the reference to the object whose method ofr constructor is called
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // that's why it is here used as Human.population instead of this.population
    }
}
