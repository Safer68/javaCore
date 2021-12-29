package Lesson14.Repository;

import Lesson14.Bean.Student;
import Lesson14.Course;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final List<Student> listStudents = new ArrayList<>();
    private final int number;
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getNumber() {
        return number;
    }

    public Course getCourse() {
        return course;
    }

    public Group(int number, Course course) {
        this.number = number;
        this.course = course;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }
}
