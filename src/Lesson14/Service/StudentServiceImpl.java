package Lesson14.Service;

import Lesson14.Bean.Student;
import Lesson14.Constants;
import Lesson14.Course;
import Lesson14.Repository.Group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private final List<Group> students = new ArrayList<>();

    @Override
    public void createStudents(String name, Group group) {
        if (group != null) {
            new Student(name, group);
        }
    }

    @Override
    public void createGroup(int number, Course course) {
        if (!students.contains(number)) {
            students.add(new Group(number, course));
        }
    }

    @Override
    public void nextCourse(Group group) {
        if (group != null) {
            if (group.getCourse().ordinal() != group.getCourse().values().length - 1) {
                group.setCourse(Course.values()[group.getCourse().ordinal() + 1]);
                delStudentGroup(group);
            }
        }
    }

    @Override
    public void printGroup(Group group) {
        if (group != null) {
            for (Student e : group.getListStudents()) {
                System.out.println(e.getName() + " студент " + e.getGroup().getCourse().getCourse() + " курса группы № "
                        + e.getGroup().getNumber());
            }
        }
    }

    @Override
    public void printStudents() {
        for (Group e : students) {
            printGroup(e);
        }
    }

    @Override
    public void printCourse(Course course) {
        for (Group e : students) {
            for (Student student : e.getListStudents()) {
                if (student.getGroup().getCourse() ==course){
                    System.out.println(student.getName() + " студент " + student.getGroup().getCourse().getCourse()
                            + " курса группы № " + student.getGroup().getNumber());
                }

            }
        }
    }

    public List<Group> getListGroup() {
        return students;
    }

    private void delStudentGroup(Group group) {
        if (group != null) {
            Iterator<Student> iterator = group.getListStudents().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getDiary().averageScore() <= Constants.AVERAGE_SCORE) {
                    iterator.remove();
                }
            }
        }
    }

    public Group getGroup(int number) {
        Group group = null;
        for (Group e : students) {
            if (number == e.getNumber()) {
                group = e;
            }
        }
        return group;
    }
}
