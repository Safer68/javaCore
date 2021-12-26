package Lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */

public class Task39 {
    private final List<Integer> listRating = new ArrayList<>();
    public static final int NUMBER_OF_STUDENTS = 15;
    public static final int BAD_RATING=4;

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
        Iterator<Integer> iterator = listRating.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() <= a) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Task39 task39 = new Task39(NUMBER_OF_STUDENTS);
        task39.printListRating();
        System.out.println("------------------");
        task39.delBadGrade(BAD_RATING);
        task39.printListRating();
    }
}
