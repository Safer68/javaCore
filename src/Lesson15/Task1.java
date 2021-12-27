package Lesson15;

import Lesson14.Bean.Student;
import Lesson14.Course;
import Lesson14.Repository.Group;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Сгенерировать 10 студентов, отсортировать студентов по группе, если группы однинаковые то по оценкам.
 */
public class Task1 {
    public static void main(String[] args) {
        Group group1 = new Group(4578, Course.COURSE1);
        Group group2 = new Group(4589, Course.COURSE3);
        Group group3 = new Group(4586, Course.COURSE2);

        List<Student> list = new ArrayList<>();
        list.add(new Student("Петя", group1));
        list.add(new Student("Вася", group1));
        list.add(new Student("Витя", group1));
        list.add(new Student("Коля", group2));
        list.add(new Student("Артем", group2));
        list.add(new Student("Паша", group2));
        list.add(new Student("Матвей", group3));
        list.add(new Student("Кирилл", group3));
        list.add(new Student("Вася", group1));
        list.add(new Student("Артем", group3));

        Collections.sort(list, new SortStudent());

        printList(list);
    }

    private static void printList(List<Student> list) {
        for (Student e: list) {
            System.out.println(e.getName() + " Группа: " + e.getGroup().getNumber() + " средний бал: "
                    + e.getDiary().averageScore());
        }
    }
}
