package Lesson5;

import static java.lang.Math.sqrt;

public class Task7 {
    public static boolean close(int a, int b, int r) {

        return r > sqrt(a * a + b * b);
    }
}
