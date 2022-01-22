package Lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Сгенерируйте List коллекцию целых чисел из n элементов от minValue до
 * maxValue. Определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream.
 */
public class Task63 {
    public static int n = 15;

    public static void main(String[] args) {

        System.out.println(createList().stream().anyMatch(integer -> integer % 3 == 0 && integer % 5 == 0));

    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt());
        }
        return list;
    }
}
