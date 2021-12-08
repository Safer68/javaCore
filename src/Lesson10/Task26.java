package Lesson10;

import java.util.Scanner;

public class Task26 {
    String string;

    public Task26() {
        Scanner in = new Scanner(System.in);
        string = in.nextLine();
    }

    public void punctuationMarks(char ch) {
        int n = 0;
        char symbol;
        for (int i = 0; i < string.length(); i++) {
            symbol = string.charAt(i);
            if (ch == symbol) {
                n++;
            }
        }
        System.out.println("Количество символов " + "'" + ch + "' : " + n);
    }

    public static void main(String[] args) {
        Task26 task26 = new Task26();
        task26.punctuationMarks(',');
        task26.punctuationMarks('.');
    }
}
