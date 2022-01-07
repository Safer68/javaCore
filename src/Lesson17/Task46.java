package Lesson17;

import java.io.File;

/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class Task46 {

    public static void main(String[] args) {
        File folder = new File("C:/");

        for (File file :folder.listFiles()) {
            System.out.println(file.getName());

        }

    }
}