package Lesson6;

public class Task11 {
    private int a;

    public Task11(int a) {
        this.a = a;
    }

    public void printValue() {
        switch (a) {
            case 1:
                System.out.println("Плыны на Понедельник: ");
                break;
            case 2:
                System.out.println("Плыны на Вторник: ");
                break;
            case 3:
                System.out.println("Плыны на Среду: ");
                break;
            case 4:
                System.out.println("Плыны на Четверг: ");
                break;
            case 5:
                System.out.println("Плыны на Пятницу: ");
                break;
            case 6:
                System.out.println("Плыны на Субботу: ");
                break;
            case 7:
                System.out.println("Плыны на Воскресенье: ");
                break;
            default:
                System.out.println("Проверить введенные значения!");
        }
    }
}
