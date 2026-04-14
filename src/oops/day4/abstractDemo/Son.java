package oops.day4.abstractDemo;

public class Son extends Parent {

//    public class Son extends Parent, Parent2 { // cannot do this because java prevents multiple inheritance, for this we need to use interfaces

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
