package Lesson21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * От текущей даты вывести на экран дату, которая была 60 дней назад.
 */
public class Task66 {
    private static final LocalDateTime localDateTime = LocalDateTime.now();
    private static final int MINUS_DAYS = 60;

    public static void main(String[] args) {

        System.out.println(localDateTime.minusDays(MINUS_DAYS).format(DateTimeFormatter.ISO_DATE));

    }
}
