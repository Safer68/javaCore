package Lesson14;

public enum Course {
    COURSE1(1),COURSE2(2),COURSE3(3),COURSE4(4),COURSE5(5);
    private final int course;

    Course(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
}
