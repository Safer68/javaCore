package Lesson18;

import java.io.*;

/**
 * Создать объект Person c полями name, surname, age. Сгенерировать 10
 * объектов класса Person со случайными полями соответствующего типа.
 * С помощью Java создать файл, в который запишется информация о этих людях(Записать как объект).
 * Затем прочесть. Для записи и чтения использовать отдельные методы.
 */
public class Task51 {
    private static final String NAME_FILE = "Task51";

    public static void main(String[] args) {

        writeFile();
        readFile();

    }

    private static void writeFile() {

        try (FileOutputStream outputStream = new FileOutputStream(NAME_FILE);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(new Person("Имя 1", "Фамилия 1", 45));
            objectOutputStream.writeObject(new Person("Имя 2", "Фамилия 2", 46));
            objectOutputStream.writeObject(new Person("Имя 3", "Фамилия 3", 47));
            objectOutputStream.writeObject(new Person("Имя 4", "Фамилия 4", 48));
            objectOutputStream.writeObject(new Person("Имя 5", "Фамилия 5", 49));
            objectOutputStream.writeObject(new Person("Имя 6", "Фамилия 6", 50));
            objectOutputStream.writeObject(new Person("Имя 7", "Фамилия 7", 51));
            objectOutputStream.writeObject(new Person("Имя 8", "Фамилия 8", 52));
            objectOutputStream.writeObject(new Person("Имя 9", "Фамилия 9", 53));
            objectOutputStream.writeObject(new Person("Имя 10", "Фамилия 10", 54));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try (FileInputStream inputStream = new FileInputStream(NAME_FILE);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            while (true) {
                try {
                    System.out.println(objectInputStream.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
