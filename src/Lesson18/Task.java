package Lesson18;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Прочесть из файла строки слов. Найти наибольше повторяющееся слово и вывести его на экран.
 */
public class Task {
    private static final Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        String nameFile = "Task.txt";
        createNewFile(nameFile);
        searchWord(nameFile);
        printMaxNumberWord();

    }

    private static void createNewFile(String nameFile) {

        try (Writer writer = new PrintWriter(nameFile)) {
            writer.write("Прочесть из файла файла строки слов. " +
                    "Найти слово наибольше повторяющееся слово слово и вывести его на экран.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchWord(String nameFile) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile))) {
            String res = bufferedReader.readLine();
            while (res != null) {
                for (String word : res.split(" ")) {
                    Integer oldCount = map.get(word);
                    if (oldCount == null) {
                        oldCount = 0;
                    }
                    map.put(word, oldCount + 1);
                }
                res = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMaxNumberWord() {
        int i = 0;
        String word = null;
        for (String words : map.keySet()) {
            if (map.get(words) > i) {
                i = map.get(words);
                word = words;
            }
        }
        System.out.println(word);
    }

}
