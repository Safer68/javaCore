package Lesson14.Bean;

import Lesson14.Repository.Diary;
import Lesson14.Repository.Group;

import java.util.Objects;

public class Student {
    private final String name;
    private Group group;
    private final Diary diary = new Diary();


    public Student(String name, Group group) {
        this.name = name;
        this.group = group;
        registerListGroup();
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public Diary getDiary() {
        return diary;
    }

    private void registerListGroup() {
        group.getListStudents().add(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(diary, student.diary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, diary);
    }

}
