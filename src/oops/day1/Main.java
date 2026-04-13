package oops.day1;

import java.util.Arrays;

class Student {
    int rollNo;
    String name;
    float marks;

    //constructor overloading


    // we need one word to access every object
    //The 'this' keyword in Java is a reference variable that points to the current object whose method or constructor is being executed.
    //Student st = new Student(55, "SK", 89.4f); then here st will be replaced with this'
    Student(int roll, String nm, float mks) {
        this.rollNo = roll;
        this.name = nm;
        this.marks = mks;
    }


    Student(){
//        this.rollNo = 44;
//        this.name = "Nak";
//        this.marks = 89.1f;
        this (44,"Nak",89.1f); //call a constructor from another constructor
        // internally : new Student (44,"Nak",89.1f)
    }

    Student (Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }
}

public class Main {

    public static void main(String[] args) {

        // class is a template of an object consisting of properties and methods (logical construct)
        // object is an instance of class which occupies space in property (physical reality)
        // class creates a data type that we can use to create objects
        // when you declare an object using a class, you are creating an instance of that class
        // three essential properties of objects: state, identity and behaviour

        Student student; // declaring the reference variable of this Student data type
        student = new Student(); // this new operator dynamically allocates the memory at run time and return a reference to it
        // hence all class objects in java must be allocated dynamically

//        System.out.println(student.rollNo);
        student.rollNo = 44;
//        System.out.println(student.rollNo);

        Student stu = new Student();
//        System.out.println(stu.rollNo);


        // here Student() is a Constructor : a constructor basically defines what happens when your object is created
        // constructor is special function, that runs when you create an object, and it allocates some variables
        // when no values then it is by default constructors.

        Student st = new Student(55, "SK", 89.4f); // bind these arguments with object

        Student s = new Student(st);
        System.out.println(s.name);

    }

}

