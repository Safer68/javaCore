package Lesson5;

public class Task13 {
    private static final int A = 25;
    public static void Multiplication() {
        int i = 1;
        double sum = 1;
        do {
            sum = sum * i;
            i++;
        }
        while (i <= A);

        System.out.println(sum);
    }
}
