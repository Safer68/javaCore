package Lesson6;

public class Task9 {
    private int day;
    private int month;
    private int year;

    public Task9(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printValue() {
        switch (month) {
            case 2:
                if (day >= 1 && day < 28) {
                    day++;
                } else if (day == 28) {
                    day = 1;
                    month++;
                } else {
                    System.out.println("Проверить введенные значения!");
                    break;
                }
                System.out.println("Data: " + day + "/" + month + "/" + year);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 1 && day < 30) {
                    day++;
                } else if (day == 30) {
                    day = 1;
                    month++;
                } else {
                    System.out.println("Проверить введенные значения!");
                    break;
                }
                System.out.println("Data: " + day + "/" + month + "/" + year);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day >= 1 && day < 31) {
                    day++;
                } else if (day == 31) {
                    day = 1;
                    month++;
                } else {
                    System.out.println("Проверить введенные значения!");
                    break;
                }
                System.out.println("Data: " + day + "/" + month + "/" + year);
                break;
            case 12:
                if (day >= 1 && day < 31) {
                    day++;
                } else if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else {
                    System.out.println("Проверить введенные значения!");
                    break;
                }
                System.out.println("Data: " + day + "/" + month + "/" + year);
                break;
            default:
                System.out.println("Проверить введенные значения!");
        }
    }
}
