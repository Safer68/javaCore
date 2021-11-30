package Lesson6;

public class Task17 {

    private int a;

    public Task17(int a) {
        this.a = a;
    }

    public void printValue() {

        int b = a;
        int i = 0;

        while (b != 0) {
            b /= 10;
            i++;
        }
        i--;
        int j = i;
        while (i >= 0) {
            if ((i + 1) % 3 == 0 && i != j) {
                System.out.print(" ");
            }
            b = (int) ((a / (long) (Math.pow(10, i))));
            System.out.print(b% 10);
            i--;
        }
    }
}

