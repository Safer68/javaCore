package Lesson21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;

/**
 * От текущей даты вывести расписание всех встреч, которые происходят
 * еженедельно в 13:00 в течение 2 месяцев.
 */
public class Task65 {

    private static LocalDateTime localDateTime = LocalDateTime.now();

    private static final int HOUR = 13;
    private static final int MINUTE = 0;
    private static final int PERIOD = 2;


    public static void main(String[] args) {

        localDateTime = localDateTime.getHour() < HOUR ? localDateTime.withHour(HOUR).withMinute(MINUTE)
                : localDateTime.withHour(HOUR).withMinute(MINUTE).plusDays(7);

        while (localDateTime.getMonth().getValue() < LocalDateTime.now().getMonth().getValue() + PERIOD
                || localDateTime.getDayOfMonth() < LocalDateTime.now().getDayOfMonth()) {
            System.out.println(localDateTime.format(new DateTimeFormatterBuilder()
                    .appendPattern("HH.mm: dd/MM/yyyy").toFormatter()));
            localDateTime = localDateTime.plusDays(7);
        }
    }
}
