package Lesson5;

public class Task12 {

    public static void factorial() {
        int i = 1;
        int fact = 1;
        while (i <= 10) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }

}
