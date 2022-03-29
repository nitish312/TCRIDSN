//sleep()
public class thread4 extends Thread  {
    public void run()
    {
        for (int i =1;i<=10;i++){
            System.out.println(" id " + Thread.currentThread().getId()  +   "  " +  i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        thread4 t1 = new thread4();
        thread4 t2 = new thread4();
        t1.start();
        t2.start();
    }
}
