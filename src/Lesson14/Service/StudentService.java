package Lesson14.Service;

import Lesson14.Course;
import Lesson14.Repository.Group;

public interface StudentService {

    void createStudents(String name, Group group);

    void createGroup(int number, Course course);

    void nextCourse(Group group);

    void printGroup(Group group);

    void printStudents();

    void printCourse(Course course);
}
