package Task14;

import java.time.LocalDate;
import java.util.List;

public class Reader implements Runnable {

    List<Integer> integerList;

    public Reader(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!integerList.isEmpty()) {
                System.out.println(integerList);
                integerList.clear();
            } else {
                System.out.println(LocalDate.now() + " The list is empty");
            }
        }
    }
}
