package Lesson16;

import Lesson14.Service.HeavyBoxService;
import Lesson14.Service.HeavyBoxServiceImpl;
import Lesson16.Bean.HeavyBox;

import java.util.Set;
import java.util.TreeSet;

/**
 * Создать TreeSet содержащий HeavyBox (вес, размер).
 * HeavyBox должен реализовать интерфейс Comparable(сортировка по весу, если вес одинаковый то по размеру).
 * Распечатать содержимое с помощью for each.
 */
public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        HeavyBoxService heavyBoxService = new HeavyBoxServiceImpl();
        Set<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(1456.0, 879.0));
        set.add(new HeavyBox(456.0, 8634.0));
        set.add(new HeavyBox(3548.0, 7893.0));
        set.add(new HeavyBox(7896.0, 8789.0));
        set.add(new HeavyBox(1338.0, 879.0));
        printHeavyBoxSet(heavyBoxService, set);
    }

    private static void printHeavyBoxSet(HeavyBoxService heavyBoxService, Set<HeavyBox> set) {

        for (HeavyBox e : set) {
            heavyBoxService.printHeavyBox(e);
        }
    }
}
