package Lesson5;

public class Task5 {
    private final int second;

    public Task5(int second) {
        this.second = second;
    }

    private int prov(double a, int b) {
        if (a / b > 1) {
            return (int) (a % b);
        } else
            return (int) (a / b);
    }

    public void convertSeconds() {
        System.out.println("Weeks:" + second / (60 * 60 * 24 * 7));
        System.out.println("  Day:" + prov((double) second / (60 * 60 * 24), 7));
        System.out.println("    H:" + prov((double) second / (60 * 60), 24));
        System.out.println("    M:" + prov((double) second / 60, 60));
        System.out.println("    S:" + prov(second, 60));
    }
}
