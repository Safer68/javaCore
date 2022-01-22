package Lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Напишите программу, которая для всех четных значений длин от 1 до 20
 * дюймов:
 * • печатает на экран значения в дюймах;
 * • переводит значения в сантиметры;
 * • печатает на экран сумму в сантиметрах;
 */
public class Task61 {
    public static void main(String[] args) {

        inchValue().forEach(System.out::println);
        System.out.println("--------------------------");

        double i =inchValue()
                .mapToDouble(value -> value * 2.54)
                .reduce(Double::sum)
                .orElse(0);

        System.out.println(i);
    }

    private static IntStream inchValue() {
        return IntStream.range(1, 20).filter(value -> value % 2 == 0);
    }
}
