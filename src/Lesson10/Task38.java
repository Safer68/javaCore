package Lesson10;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Seasons seasons = Seasons.valueOf(in.next());
        System.out.println(seasons.getDescription() + seasons.getCountOfDays() + " день");
    }
}
