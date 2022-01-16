package Lesson20;

import java.util.stream.Stream;

/**
 * * Создать метод, который печатает название потока и засыпает на 2 секунды.
 * Запустить одновременно 10 потоков.
 * Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */
public class Task55 {

    public static void main(String[] args) throws InterruptedException {

        Stream.generate(() -> new Thread(Task55::printNameThread))
                .limit(10)
                .forEach(Thread::start);
    }

    public static synchronized void printNameThread() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

