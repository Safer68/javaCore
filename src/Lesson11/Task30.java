package Lesson11;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(text.replaceAll("<.+?>", "<p>"));

    }
}
