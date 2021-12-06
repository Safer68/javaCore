package Lesson9;

public class MethodMain {
    public static void main(String[] args) {
        Skill javaCore = new Skill(22);

        FirstTypeStudent student1 = new FirstTypeStudent("Вася", new FirstType());
        System.out.print("Карточка студента: ");
        System.out.println(student1.getName());
        student1.setSkill(javaCore);
        student1.timeSpentLearning();

        FirstTypeStudent student2 = new FirstTypeStudent("Петя", new SecondType());
        System.out.print("Карточка студента: ");
        System.out.println(student2.getName());
        student2.setSkill(javaCore);
        student2.timeSpentLearning();

        FirstTypeStudent student3 = new FirstTypeStudent("Витя", new ThirdType());
        System.out.print("Карточка студента: ");
        System.out.println(student3.getName());
        student3.setSkill(javaCore);
        student3.timeSpentLearning();

        FirstTypeStudent student4 = new FirstTypeStudent("Матвей", new FirstType());
        System.out.print("Карточка студента: ");
        System.out.println(student4.getName());
        student4.setSkill(javaCore);
        student4.timeSpentLearning();

        FirstTypeStudent student5 = new FirstTypeStudent("Саша", new SecondType());
        System.out.print("Карточка студента: ");
        System.out.println(student5.getName());
        student5.setSkill(javaCore);
        student5.timeSpentLearning();

        FirstTypeStudent student6 = new FirstTypeStudent("Егор", new ThirdType());
        System.out.print("Карточка студента: ");
        System.out.println(student6.getName());
        student6.setSkill(javaCore);
        student6.timeSpentLearning();

        FirstTypeStudent student7 = new FirstTypeStudent("Валера", new FirstType());
        System.out.print("Карточка студента: ");
        System.out.println(student7.getName());
        student7.setSkill(javaCore);
        student7.timeSpentLearning();

        FirstTypeStudent student8 = new FirstTypeStudent("Леша", new SecondType());
        System.out.print("Карточка студента: ");
        System.out.println(student8.getName());
        student8.setSkill(javaCore);
        student8.timeSpentLearning();

        FirstTypeStudent student9 = new FirstTypeStudent("Миша", new ThirdType());
        System.out.print("Карточка студента: ");
        System.out.println(student9.getName());
        student9.setSkill(javaCore);
        student9.timeSpentLearning();
    }
}
