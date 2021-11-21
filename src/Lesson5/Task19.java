package Lesson5;

public class Task19 {
    private static final int[] array = new int[10];

    public static void array() {
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
    }

    public static void getEvan() {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }

    }

}
