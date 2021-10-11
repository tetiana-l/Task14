package Task14;

public class MultithreadingFillArray implements Runnable {

    int from;
    int to;
    String[] stringArr = new String[20000000];

    public MultithreadingFillArray(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        System.out.println("Thread START::" + Thread.currentThread().getName());
        long startTime = System.currentTimeMillis();

        for (int i = from; i < to; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                stringArr[i] = "Fizz";
            } else if (i % 5 == 0) {
                stringArr[i] = "Buzz";
            } else if (i % 3 == 0) {
                stringArr[i] = "FizzBuzz";
            } else {
                String value = Integer.toString(i);
                stringArr[i] = value;
            }
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Thread complete in " + timeSpent);
        System.out.println("Thread END::" + Thread.currentThread().getName());
    }
}
