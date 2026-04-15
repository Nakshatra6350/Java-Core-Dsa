package threadsconcept;

class AA extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BB extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) throws NumberFormatException {

        AA obj1=new AA();
        BB obj2=new BB();

//    	obj1.show();
//    	obj2.show();

        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());

        obj1.start();
        try {
            Thread.sleep(2);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
