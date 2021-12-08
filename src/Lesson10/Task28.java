package Lesson10;

import java.util.Scanner;

public class Task28 {
    String string;

    public Task28() {
        Scanner in = new Scanner(System.in);
        string = in.nextLine();
    }

    public String concatenation() {
        char symbol;
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            symbol = string.charAt(i);
            if (' ' == symbol) {
                n.append(string.charAt(i - 1));
            }
        }
        n.append(string.charAt(string.length() - 1));
        return n.toString();
    }

    public static void main(String[] args) {
        Task28 task28 = new Task28();
        System.out.println(task28.concatenation());
    }
}
