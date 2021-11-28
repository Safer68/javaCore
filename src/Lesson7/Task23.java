package Lesson7;

public class Task23 {
    int[][] array;

    public Task23(int[][] array) {
        this.array = array;
    }

    public void arraybutterfly() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j && j <= array.length - i - 1 || i >= j && j >= array.length - i - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }

    public void printArray() {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }

}
