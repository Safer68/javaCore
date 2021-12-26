package Lesson14;

import Lesson14.Bean.HeavyBox;
import Lesson14.Service.HeavyBoxService;
import Lesson14.Service.HeavyBoxServiceImpl;

import java.util.*;

/**
 * Создать коллекцию, содержащую объекты класса HeavyBox(два поля размер и вес).
 * б) Распечатать его содержимое используя for each.
 * в) Изменить вес первого ящика на 1.
 * г) Удалить последний ящик.
 * д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * е) Удалить все ящики.
 */
public class Task2 {

    public static void main(String[] args) {
        HeavyBoxService heavyBoxService = new HeavyBoxServiceImpl();
        List<HeavyBox> list = new ArrayList<>();
        list.add(heavyBoxService.createHeavyBox(12, 45));
        list.add(heavyBoxService.createHeavyBox(15, 89));
        list.add(heavyBoxService.createHeavyBox(15, 89));
        list.add(heavyBoxService.createHeavyBox(15, 89));
        list.add(heavyBoxService.createHeavyBox(15, 89));
        /**
         * б) Распечатать его содержимое используя for each.
         */
        heavyBoxService.printList(list);
        /**
         * в) Изменить вес первого ящика на 1.
         */
        list.get(0).setWeight(list.get(0).getWeight() - 1);
        /**
         * г) Удалить последний ящик.
         */
        list.remove(list.size() - 1);
        /**
         * д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
         */

        HeavyBox[] array1 = list.toArray(new HeavyBox[0]);
        heavyBoxService.printArray(array1);

        HeavyBox[] array2 = new HeavyBox[list.size()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = list.get(i);
        }
        heavyBoxService.printArray(array2);

        HeavyBox [] array3 = list.stream().toArray(HeavyBox[]::new);
        heavyBoxService.printArray(array3);
        /**
         * Удалить все ящики.
         */
        list.clear();
        System.out.println(list.size());
    }
}
