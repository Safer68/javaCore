package Lesson17;

/**
 * Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.
 */
public class Task45 {
    public static void main(String[] args) {
        try {
            method();
        } catch (Task44.CustomException e) {
            System.out.println(e);
        }
    }

    public static void method() throws Task44.CustomException {
        throw new Task44.CustomException();
    }
}
