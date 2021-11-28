package Lesson7;

public class Task20 {
    private final int[] array = new int[10];

    public void arrayIndexMax() {
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 10);

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > b) {
                b = array[i];
                a = i;
            }
        }
        System.out.println(a);

    }

}
