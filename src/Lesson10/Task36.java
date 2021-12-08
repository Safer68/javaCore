package Lesson10;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Seasons seasons = Seasons.valueOf(in.next());
        if (seasons.ordinal() == 0) {
            System.out.println(Seasons.values()[Seasons.values().length - 1]);
        } else {
            System.out.println(Seasons.values()[seasons.ordinal() - 1]);
        }

    }
}
