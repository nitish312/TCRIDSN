//getId ()
//getName()
public class thread3 extends Thread  {
    public void run()
    {
        for (int i =1;i<=10;i++){
            System.out.print(" id " + Thread.currentThread().getId()  +   "  " +  i);
            System.out.println(" Name " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        thread3 t1 = new thread3();
        t1.start();

        for (int i =1;i<=10;i++){
            System.out.print(" id " + Thread.currentThread().getId()  +   "  " +  i);
            System.out.println(" Name " + Thread.currentThread().getName());
        }

        thread3 t2 = new thread3();
        t2.start();
    }
}
