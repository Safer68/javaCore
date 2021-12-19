package Lesson13;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

public class Task40 {
    private final List<Integer> listRandom = new ArrayList<>();

    public Task40(int size) {
        for (int i = 0; i < size; i++) {
            listRandom.add((int) ((Math.random() * 10)));
        }
    }

    public void printListRandom() {
        for (int e : listRandom) {
            System.out.println(e);
        }
    }

    public void delDouble() {

        Set<Integer> set = new LinkedHashSet<>(listRandom);
        listRandom.clear();
        listRandom.addAll(set);
    }

    public static void main(String[] args) {
        Task40 task40 = new Task40(10);
        task40.printListRandom();
        System.out.println("------------");
        task40.delDouble();
        task40.printListRandom();


    }
}
