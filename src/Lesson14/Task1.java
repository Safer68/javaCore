package Lesson14;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
 * Избавиться от повторяющихся элементов в строке и вывести результат на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 4, 5";
        String[] words = str.split(" ");
        Set<String> set = new LinkedHashSet(Arrays.asList(words));

        StringBuilder stringBuilder = new StringBuilder();
        for (String e : set) {
            stringBuilder.append(e + " ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);
    }
}
