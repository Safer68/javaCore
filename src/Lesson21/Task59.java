package Lesson21;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых чисел -> засыпает произвольно на 1-10 секунд,
 * результат выполнения – сумму этих чисел в виде строки.
 * Запустить 10 задач параллельно в пуле из 3 потоков.
 * Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */
public class Task59 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {

            String sum = executorService.submit(() -> createCallable().call()).get()
                    .stream()
                    .reduce(Integer::sum)
                    .orElse(0).toString();
            System.out.println(sum);
        }
        executorService.shutdown();
    }

    private static Callable<List<Integer>> createCallable() throws InterruptedException {
        Callable<List<Integer>> callable = () -> Stream.generate(() -> new Random().nextInt(100))
                .limit(10)
                .collect(Collectors.toList());
        Thread.sleep((new Random().nextInt(9) + 1) * 1000);
        System.out.println(Thread.currentThread().getName());
        return callable;
    }
}


