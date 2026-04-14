package oops.day4.abstractDemo;

public class Main {
    public static void main(String[] args) {
        // Parent mom = new Parent(45); // cant create object of an abstract class

        Son son = new Son(30);
        son.career();

        son.normal();

        Parent daughter = new Daughter(28);
        daughter.career();

        Parent.hello();

    }
}
