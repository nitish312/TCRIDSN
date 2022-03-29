//join () : if a thread wants to wait for another thread to complete its taskts then,
// we have to use join() .

class thread5 extends Thread  {
    public void run()
    {
        for (int i =1;i<=10;i++){
            System.out.println(" id " + Thread.currentThread().getId()  +   "  " +  i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        thread5 t1 = new thread5();
        thread5 t2 = new thread5();
        thread5 t3 = new thread5();

        t1.start();
        System.out.println(t1.isAlive());

        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(t1.isAlive());

        t2.start();
        t3.start();
    }
}

