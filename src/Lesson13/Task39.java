package Lesson13;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */

public class Task39 {
    private final List<Integer> listRating = new ArrayList<>();

    public Task39(int size) {
        for (int i = 0; i < size; i++) {
            listRating.add((int) ((Math.random() + 0.1) * 10));
        }
    }

    public void printListRating() {
        for (int e : listRating) {
            System.out.println(e);
        }
    }

    public void delBadGrade(int a) {
        Object[] array2 = listRating.toArray();
        for (Object e : array2) {
            if ((Integer) e <= a) {
                listRating.remove(e);
            }
        }
    }

    public static void main(String[] args) {
        Task39 task39 = new Task39(10);
        task39.printListRating();
        System.out.println("------------------");
        task39.delBadGrade(4);
        task39.printListRating();

    }
}
