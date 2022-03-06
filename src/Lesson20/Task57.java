package Lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Есть 3 производителя и 2 потребителя, все разные потоки и работают все
 * одновременно. Есть очередь с 200 элементами. Производители добавляют
 * случайное число от 1..100, а потребители берут эти числа. Если в очереди
 * элементов >= 100 производители спят, если нет элементов в очереди – потребители спят.
 * Если элементов стало <= 80 производители просыпаются.
 * Все это работает до тех пор, пока обработанных элементов не станет 10000, только потом программа завершается.
 */
public class Task57 {
    public static final List<Integer> list = new ArrayList<>();

    private static int s = 0;
    private static final int limit = 10000;

    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextInt(100)).limit(200).forEach(list::add);

        new Thread(Task57::startConsumer).start();
        new Thread(Task57::startConsumer).start();

        new Thread(Task57::startManufacturer).start();
        new Thread(Task57::startManufacturer).start();
        new Thread(Task57::startManufacturer).start();

    }

    private static void startManufacturer() {
        while (s < limit) {
            addList();
        }
    }

    private static void startConsumer() {
        while (s < limit) {
            removeList();
        }
    }

    private static void removeList() {
        synchronized (list) {
            if (list.size() != 0) {
                list.notify();
                list.remove(0);
                s++;

            } else {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void addList() {
        synchronized (list) {
            if (list.size() >= 100) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (list.size() <= 80) {
                list.notifyAll();
                list.add(new Random().nextInt(100));
            }
        }
    }

}
