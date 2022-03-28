//2nd way to create thread by runnable interface

public class thread2 implements Runnable {
    public void run()
    {
        System.out.println("thread is running ");
    }

    public static void main(String[] args) {
        thread2 obj = new thread2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
