package Lesson18;

import java.io.*;
import java.util.Random;

/**
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */
public class Task50 {

    private static final String path = "папка1/папка2/папка3/";
    private static final String fileName = path + "file";

    public static void main(String[] args) {
        int numberFile = 5;
        createFolder();
        createFile(numberFile);
        commonFile(fileName, numberFile);
        printFolder();

    }

    private static void createFile(int number) {
        for (int i = 0; i < number; i++) {
            newFile(fileName + i);
        }
    }

    private static void newFile(String fileName) {
        try (Writer fileWriter = new PrintWriter(fileName)) {
            for (int i = 0; i <= 10; i++) {
                String s = Integer.toString(new Random().nextInt(100));
                fileWriter.write(s + System.getProperty("line.separator"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFolder() {

        File file = new File(path);
        file.mkdirs();

    }

    public static void commonFile(String file, int number) {
        String commonFile = path + "commonFile";
        try (Writer fileWriter = new PrintWriter(commonFile)) {
            for (int i = 0; i < number; i++) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file + i))) {
                    String res = bufferedReader.readLine();
                    while (res != null) {
                        fileWriter.write(res + System.getProperty("line.separator"));
                        res = bufferedReader.readLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFolder() {
        File folder = new File(path);
        String listFile = path + "listFolder";
        try (Writer fileWriter = new PrintWriter(listFile)) {
            for (File file : folder.listFiles()) {
                fileWriter.write(file.getName() + System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
