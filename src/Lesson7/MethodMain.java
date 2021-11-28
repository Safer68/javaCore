package Lesson7;

public class MethodMain {
    public static void main(String[] args) {
        System.out.println("-------------Task20-----------------");
        Task20 task20 = new Task20();
        task20.arrayIndexMax();
        System.out.println("-------------Task21-----------------");
        Task21 task21 = new Task21();
        task21.range();
        task21.printSumRange();
        System.out.println("-------------Task22-----------------");
        Task22 task22 = new Task22();
        task22.printArray();
        task22.arrayRevers();
        System.out.println("-------");
        task22.printArray();
        System.out.println("-------------Task23-----------------");
        Task23 task23 = new Task23(new int[30][30]);
        task23.arraybutterfly();
        task23.printArray();
    }
}
