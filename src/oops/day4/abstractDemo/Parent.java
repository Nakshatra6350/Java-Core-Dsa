package oops.day4.abstractDemo;

// if any one method is abstract in a class it is necessary to make that class abstract, hence cant create object of an abstract class
// cannot create abstract constructors
// all due to if it was possible then i can access the abstract method, but it does not have any body so it will give error

// cannot create abstract static methods because, static methods cant be overridden and abstract methods should be overridden.


public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){    // can create static methods in abstract class, and there is no object for abstract classes, condition met for using static methods
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
