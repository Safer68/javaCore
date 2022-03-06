package Lesson21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Создать задачу Callable, которая берет сообщение “Hello World” + текущее
 * время и записывает его в файл. Запись в файл должна производиться
 * последовательно через синхронизированный метод. Запустить 10 задач
 * параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */
public class Task60 {
    public static final String NAME_FIE = "Task60";
    private static final File file = new File(NAME_FIE);

    public static void main(String[] args) {
        Task60 task60 = new Task60();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Callable<String> callable = () -> {
                System.out.println(Thread.currentThread().getName());
                return "Hello Word " + new Date().getTime();};
            try {
                task60.writeFile(executorService.submit(callable).get());
            } catch (InterruptedException | ExecutionException e ) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }

    private synchronized void writeFile(String text) {

        try (Writer fileWriter = new FileWriter(file, true)) {
            fileWriter.append(text).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
