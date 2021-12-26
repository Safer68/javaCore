package Lesson14.Service;

import Lesson14.Bean.HeavyBox;

import java.util.List;

public interface HeavyBoxService {

    HeavyBox createHeavyBox(int size, int weight);

    void printHeavyBox(HeavyBox heavyBox);

    void printList(List <HeavyBox>list);
    void printArray(HeavyBox [] a);
}
