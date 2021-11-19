package Lesson5;

public class Task14 {
    public static void sumNumber() {
        long i = 7893823445L;
        long sum = 0;
        do {
            sum = sum + i % 10;
            i = i / 10;
        }
        while (i > 0);

        System.out.println(sum);
    }
}
