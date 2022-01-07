package Lesson17;

/**
 * Написать код, который выбрасывает NullPointerException.
 * Написать обработчик этого исключения и вывести на экран сообщение,
 * которое будет содержать описание данного исключения.
 */
public class Task43 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            e.printStackTrace();

        }
    }
}
