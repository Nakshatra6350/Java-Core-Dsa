package threadsconcept;

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=1000;i++)
        {
            System.out.println("Hi");
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=1000;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) throws NumberFormatException {

        A obj1=new A();
        B obj2=new B();

//    	obj1.run();
//    	obj2.run();

        obj1.start();
        obj2.start();
    }
}
