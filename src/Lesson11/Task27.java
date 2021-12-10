package Lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Pattern pattern = Pattern.compile("\\w+\\b");
        Matcher matcher = pattern.matcher(text);
        int n = 0;
        while (matcher.find()) {
            n++;
        }
        System.out.println(n);
    }
}
