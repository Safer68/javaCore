package Lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Создайте класс Person, с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30. Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, который:
 * 1) выбирает объекты, возраст которых меньше 21;
 * 2) распечатываешь их на экран;
 * 3) сортирует по фамилии, а потом по имени(использовать thenComparing у объекта Comparator);
 * 4) берет 4 первых объекта;
 * 5) формирует коллекцию из фамилий объектов;
 * 6) агрегирует все в коллекцию.
 */
public class Task62 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Person("name" + new Random().nextInt(10),
                    "surname" + new Random().nextInt(40),
                    new Random().nextInt(16) + 15));
        }
        list.stream().filter(person -> person.getAge()<21)
                .peek(System.out::println)
                .sorted(new SortPerson())
                .limit(4).collect(Collectors.toList()).forEach(list::add);
    }
}
