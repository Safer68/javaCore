package Lesson5;

public class Task13 {
    public static void Multiplication() {
        int i = 1;
        double sum = 1;
        do {
            sum = sum * i;
            i++;
        }
        while (i < 25);

        System.out.println(sum);
    }
}
