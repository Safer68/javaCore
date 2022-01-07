package Lesson17;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать файл с текстом, в котором присутствуют числа. Найти все числа,
 * вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
 */
public class Task48 {
    public static final String SEARCH = "\\d++";
    private static List<Integer> list = new ArrayList<>();
    private static String name = "Text1.txt";

    public static void main(String[] args) {
        createFile();
        searchFilterTo(new File(name), SEARCH);
        printList(list);
        System.out.println(sumNumber(list));
        delDouble(list);
        printList(list);
    }

    private static void createFile() {
        File file = new File(name);

        try (Writer writer = new PrintWriter(file)) {
            file.createNewFile();
            writer.write("dhfk jgdhkjfghdkjf, 89 59 5599 gnvbkd, jgdklf, 59 jdfkljglkd, dfjkgdjfgdf,");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchFilterTo(File file, String s) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String res = bufferedReader.readLine();
            while (res != null) {
                Pattern pattern = Pattern.compile(s);
                Matcher matcher = pattern.matcher(res);
                while (matcher.find()) {
                    list.add(Integer.parseInt(res.substring(matcher.start(), matcher.end())));
                }
                res = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printList(List<Integer> list) {
        for (Integer e : list) {
            System.out.println(e);
        }
    }

    public static int sumNumber(List<Integer> list) {
        int sum = 0;
        for (Integer e : list) {
            sum += e;
        }
        return sum;
    }

    public static void delDouble(List list) {

        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

    }
}
