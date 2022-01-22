package Lesson18;

import java.io.*;
import java.util.Random;

/**
 * Записать с помощью Java в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
 */
public class Task49 {

    public static void main(String[] args) {

        String nameFile = "Task18";
        int number = 20;
        createFile(nameFile, number);
        readFile(nameFile);

    }

    private static void createFile(String nameFile, int number) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nameFile)))) {

            for (int i = 0; i < number; i++) {
                dataOutputStream.writeInt(new Random().nextInt(100));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String nameFile) {
        int sum = 0;
        int number = 0;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(nameFile)))) {
            while (true) {
                try {
                    int n = dataInputStream.readInt();
                    sum += n;
                    System.out.println(n);
                    number++;
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("среднее арифметическое " + (double) sum / number);
    }
}
