package Lesson10;

public enum Seasons {
    SPRINGT("Весна", 92), SUMMER("Лето", 92),
    AUTUMN("Осень", 91), WINTER("Зима", 90);

    private String description;
    private int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

}
