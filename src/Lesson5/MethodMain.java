package Lesson5;

public class MethodMain {
    public static void main(String[] args) {
        System.out.println("---------Task4-----------");
        System.out.println(Task4.SummaAndMultiplication(45,85));
        System.out.println("---------Task5-----------");
        Task5 time = new Task5(2000003);//
        time.convertSeconds();
        System.out.println("---------Task6-----------");
        System.out.println(Task6.lastSeven(458));
        System.out.println("---------Task7-----------");
        System.out.println(Task7.close(5,8,9));
        System.out.println("---------Task12-----------");
        Task12.factorial();
        System.out.println("---------Task13-----------");
        Task13.Multiplication();
        System.out.println("---------Task14-----------");
        Task14.sumNumber();
        System.out.println("---------Task19-----------");
        Task19.array();
        Task19.getEvan();
    }

}
