package Lesson21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.
 */
public class Task64 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("номер месяца: ");

        int monthNumber;
        do {
            monthNumber = scanner.nextInt();
        } while (monthNumber < 1 || monthNumber > 12);

        LocalDateTime localDateTime = LocalDateTime.now().withMonth(monthNumber).withDayOfMonth(1);

        while (localDateTime.getMonth().getValue() == monthNumber) {
            System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("d::MMMM::uuu")));
            localDateTime = localDateTime.plusDays(1);
        }
    }
}
