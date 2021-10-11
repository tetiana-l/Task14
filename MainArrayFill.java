package Task14;

public class MainArrayFill {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MultithreadingFillArray(0, 5000000));

        Thread t2 = new Thread(new MultithreadingFillArray(5000000, 10000000));

        Thread t3 = new Thread(new MultithreadingFillArray(10000000, 15000000));

        Thread t4 = new Thread(new MultithreadingFillArray(15000000, 20000000));

        Thread t5 = new Thread(new MultithreadingFillArray(0, 20000000));

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();
    }
}
