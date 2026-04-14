package oops.day4.interfaces;

public interface Engine {

    // variables are static and final by default in interfaces

    static final int PRICE = 78000;

    void start();
    void stop();
    void acc();
}
