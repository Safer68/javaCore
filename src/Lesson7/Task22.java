package Lesson7;

import java.util.Arrays;

public class Task22 {
    private final int[] array = new int[10];
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 10);
        } 
    }

    public void printArray() {
        for (int j : array) {
            System.out.println(j);
        }
    }

    public void arrayRevers() {
      
        int[] temp = Arrays.copyOf(array,array.length);
        for (int i = array.length-1;i>=0;i--){
                array[i] = temp[array.length-i-1];
            }

    }
}
