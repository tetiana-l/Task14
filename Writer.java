package Task14;

import java.util.List;
import java.util.Random;

public class Writer implements Runnable {

    List<Integer> integerList;

    public Writer(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Random random = new Random();
            integerList.add(random.nextInt(101));
            integerList.add(random.nextInt(101));
            integerList.add(random.nextInt(101));
            integerList.add(random.nextInt(101));
            integerList.add(random.nextInt(101));
            integerList.add(random.nextInt(101));
        }
    }
}
