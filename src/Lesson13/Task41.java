package Lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    private final List<Integer> listRating = new ArrayList<>();

    public Task41(int size) {
        for (int i = 0; i < size; i++) {
            listRating.add((int) ((Math.random() + 0.1) * 10));
        }
    }

    public void printListRating() {
        for (int e : listRating) {
            System.out.println(e);
        }
    }

    public int maxRating() {
        int max = 0;
        Iterator<Integer> iterator = listRating.iterator();
        while (iterator.hasNext()) {
            int a;
            if ((a=iterator.next()) > max) {
                max = a;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Task41 task41 = new Task41(15);
        task41.printListRating();
        System.out.println("------------");
        System.out.println(task41.maxRating());
        //Collections
    }
}
