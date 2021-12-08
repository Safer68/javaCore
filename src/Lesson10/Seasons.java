package Lesson10;

public enum Seasons {
    Springt("Весна", 92), Summer("Лето", 92),
    Autumn("Осень", 91), Winter("Зима", 90);

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
