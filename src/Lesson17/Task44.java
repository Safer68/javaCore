package Lesson17;

/**
 * Написать собственное исключение от Exception. Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * Результат работы программы вывести на экран.
 */
public class Task44 {
    public static void main(String[] args) {
        try {
            throw new CustomException();
        } catch (CustomException e) {
            System.out.println(e);
        }

    }

    public static class CustomException extends Exception {

    }
}
