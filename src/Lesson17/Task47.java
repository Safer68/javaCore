package Lesson17;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * препинания и слов. Вывести результат на экран.
 */
public class Task47 {
    public static final String SEARCH_ZAP = ",";
    public static final String SEARCH_SLOV = "\\w+\\b";

    public static void main(String[] args) {
        File file = new File("Text.txt");

        try (Writer writer = new PrintWriter(file)) {
            file.createNewFile();
            writer.write("dhfk jgdhkjfghdkjf, gnvbkd, jgdklf, jdfkljglkd, dfjkgdjfgdf,");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Количество символов ',' в файле: " + searchChar(file, SEARCH_ZAP));
        System.out.println("Количество слов в файле: " + searchChar(file, SEARCH_SLOV));

    }

    public static int searchChar(File file, String s) {
        int number = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String res = bufferedReader.readLine();
            while (res != null) {
                Pattern pattern = Pattern.compile(s);
                Matcher matcher = pattern.matcher(res);
                while (matcher.find()) {
                    number++;
                }
                res = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

}
