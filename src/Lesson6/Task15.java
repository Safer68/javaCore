package Lesson6;

public class Task15 {

    public void printValue() {
        int b = 0;
        int j = 0;
        for (int i = 50; i <= 70; i++) {
            for (int c = 2; c <= i; c++) {
                if (c == i) {
                    b = b + c;
                    j++;
                    break;
                }
                if (i % c == 0) {
                    break;
                }

            }

            if (j == 2) {
                System.out.println(b);
                break;
            }
        }

    }
}


