package Lesson13;


import java.util.List;

/**
 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. Замерьте время,
 * которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
 * * сделать тоже самое, только вставлять элементы не в конец а в середину списка.
 * ** можно использовать патерн стратгия
 */

public class Lesson13 implements MethodsLesson13 {
    public static final int SIZE_LIST = 1_000_000;
    public static final int RETURN_QUANTITY = 100_000;

    @Override
    public void setRandom(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * size));
        }
    }

    @Override
    public void getRandom(List<Integer> list, int quantity) {
        for (int i = 0; i < quantity; i++) {
            list.get((int) (Math.random() * list.size()));
        }
    }

    @Override
    public void setRandomList(List<Integer> list, int quantity) {
        for (int i = 0; i < quantity; i++) {
            list.add((int) (Math.random() * list.size()), (int) (Math.random() * list.size()));
        }
    }

    public static void main(String[] args) {
        Lesson13 lesson13 = new Lesson13();
        ArrayList arrayList = new ArrayList(lesson13);
        LinkedList linkedList = new LinkedList(lesson13);

        arrayList.writeList(SIZE_LIST);
        linkedList.writeList(SIZE_LIST);

        long start = System.nanoTime();
        arrayList.returnRandomList(RETURN_QUANTITY);
        long end = System.nanoTime();
        System.out.println("ArrayList выполнил возврат произвольного значения 100000 раз за: "
                + (double) (end - start) / 1_000_000_000 + " секунд");

        start = System.nanoTime();
        linkedList.returnRandomList(RETURN_QUANTITY);
        end = System.nanoTime();
        System.out.println("LinkedList выполнил возврат произвольного значения 100000 раз за: "
                + (double) (end - start) / 1_000_000_000 + " секунд");

        start = System.nanoTime();
        arrayList.writeRandomList(RETURN_QUANTITY);
        end = System.nanoTime();
        System.out.println("ArrayList выполнил вставку в середину произвольного значения 100000 раз за: "
                + (double) (end - start) / 1_000_000_000 + " секунд");

        start = System.nanoTime();
        linkedList.writeRandomList(RETURN_QUANTITY);
        end = System.nanoTime();
        System.out.println("LinkedList выполнил вставку в середину произвольного значения 100000 раз за: "
                + (double) (end - start) / 1_000_000_000 + " секунд");
    }
}
