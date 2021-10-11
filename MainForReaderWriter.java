package Task14;

import java.util.ArrayList;
import java.util.List;

public class MainForReaderWriter {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(44);
        integerList.add(66);
        integerList.add(3);
        integerList.add(6);

        Thread readerThread = new Thread(new Reader(integerList));
        Thread writerThread = new Thread(new Writer(integerList));
        readerThread.start();
        writerThread.start();
    }
}
