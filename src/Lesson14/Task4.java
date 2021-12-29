package Lesson14;

import Lesson14.Service.StudentServiceImpl;

/**
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
 * Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3.
 * Если средний балл>=3, студент переводится на следующий курс.
 * Напишите метод printStudents(List<Student> students, int Course), который получает список студентов и номер курса.
 * А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */
public class Task4 {
    public static void main(String[] args) {
        int Group1 = 4578;
        int Group2 = 4589;
        int Group3 = 4586;
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.createGroup(Group1, Course.COURSE1);
        studentService.createGroup(Group2, Course.COURSE3);
        studentService.createGroup(Group3, Course.COURSE3);

        studentService.createStudents("Петя", studentService.getGroup(Group1));
        studentService.createStudents("Вася", studentService.getGroup(Group1));
        studentService.createStudents("Витя", studentService.getGroup(Group1));
        studentService.createStudents("Коля", studentService.getGroup(Group2));
        studentService.createStudents("Артем", studentService.getGroup(Group2));
        studentService.createStudents("Паша", studentService.getGroup(Group3));
        studentService.createStudents("Паша V", studentService.getGroup(Group3));

        System.out.println("--------Группа: " + Group1 + "-----------");
        studentService.printGroup(studentService.getGroup(Group1));
        System.out.println("--------Группа: " + Group2 + "-----------");
        studentService.printGroup(studentService.getGroup(Group2));
        System.out.println("--------Группа: " + Group3 + "-----------");
        studentService.printGroup(studentService.getGroup(Group3));

        System.out.println("----Печать всех стуентов------");
        studentService.printStudents();
        System.out.println("-------Курс: " + Course.COURSE3.getCourse() + "-------");
        studentService.printCourse(Course.COURSE3);

        studentService.nextCourse(studentService.getGroup(Group1));
        studentService.nextCourse(studentService.getGroup(Group2));
        studentService.nextCourse(studentService.getGroup(Group3));

        System.out.println("----Печать всех стуентов------");
        studentService.printStudents();
    }
}
