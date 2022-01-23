package Lesson21;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно
 * на 1-3 секунды, результат выполнения – коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков.
 * Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */

public class Task58 {
    public static final String DIRECTORY = "Task58/";

    public static void main(String[] args) {
        new File(DIRECTORY).mkdirs();

        ExecutorService executorService = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 10; i++) {

            try {
                executorService.submit(() -> createCallable().call()).get().forEach(System.out::println);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }

    private static Callable<List<String>> createCallable() throws InterruptedException {
        Thread.sleep((new Random().nextInt(2) + 1) * 1000);
        System.out.println(Thread.currentThread().getName());
        return () -> Stream.generate(() -> new File(DIRECTORY + Thread.currentThread()
                .getName() + "-" + new Random().nextInt(100)))
                .limit(10)
                .peek(Task58::newFile)
                .map(File::getName)
                .collect(Collectors.toList());

    }

    private static void newFile(File file) {

        try (Writer fileWriter = new PrintWriter(file)) {
            for (int i = 0; i <= 10; i++) {
                String s = Integer.toString(new Random().nextInt(100));
                fileWriter.write(s + System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
