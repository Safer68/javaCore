package Lesson7;

public class Task21 {
    private int a;
    private int b;
    int sum = 0;
    private final int[] array = new int[10];

    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 10);
        }
    }

    public void printSumRange() {
        sumRange();
        System.out.println(sum);
    }

    public void range() {
        int max = 0;
        int indexMax = 0;
        int indexMin = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            } else if (max == array[i]) {
                a = i;
            }
        }
        int min = max;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            } else if (min == array[i]) {
                b = i;
            }
        }
        if (a != 0 || b != 0) {
            if (a - indexMax > b - indexMin) {
                this.a = indexMax;
                this.b = a;
            } else {
                this.a = indexMin;
                this.b = b;
            }
        } else {
            if (indexMax < indexMin) {
                this.a = indexMax;
                this.b = indexMin;
            } else {
                this.a = indexMin;
                this.b = indexMax;
            }
        }

    }

    private void sumRange() {

        for (int i = a + 1; i < b; i++) {
            sum = sum + array[i];
        }

    }


}
