package Lesson11;

public class Task31 {
    public static void main(String[] args) {
        String text = "aaabbbccc";
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            text += "aaabbbccc";
        }
        long end = System.nanoTime();
        System.out.println((double) (end - start) / 1_000_000_000 + " секунд");

        StringBuilder stringBuilder = new StringBuilder("aaabbbccc");
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            stringBuilder.append("aaabbbccc");
        }
        end = System.nanoTime();
        System.out.println((double) (end - start) / 1_000_000_000 + " секунд");
    }
}
