package Lesson14.Service;

import Lesson14.Bean.HeavyBox;

import java.util.List;

public class HeavyBoxServiceImpl implements HeavyBoxService {

    @Override
    public HeavyBox createHeavyBox(int size, int weight) {

        return new HeavyBox(size, weight);
    }

    @Override
    public void printHeavyBox(HeavyBox heavyBox) {
        System.out.println("-----------------------------");
        System.out.println("Размер коробки: " + heavyBox.getSize());
        System.out.println("Вес коробки:  " + heavyBox.getWeight());
        System.out.println("-----------------------------");
    }

    @Override
    public void printList(List<HeavyBox> list) {
        list.forEach(consumer -> printHeavyBox(consumer));
    }

    @Override
    public void printArray(HeavyBox [] a) {
        for (HeavyBox e : a) {
            printHeavyBox(e);
        }

    }

}
