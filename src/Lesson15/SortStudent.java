package Lesson15;

import Lesson14.Bean.Student;

import java.util.Comparator;

public class SortStudent implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGroup().getNumber() < student2.getGroup().getNumber()) {
            return 1;
        }
        if (student1.getGroup().getNumber() == student2.getGroup().getNumber()) {
            if (student1.getDiary().averageScore() > student2.getDiary().averageScore()) {
                return -1;
            } else {
                return 0;
            }
        }
        return -1;
    }


}
