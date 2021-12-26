package Lesson14;

import Lesson14.Bean.Cat;
import Lesson14.Bean.Dog;
import Lesson14.Bean.Parrot;
import Lesson14.Bean.Pet;
import Lesson14.Service.PetServiceImpl;

/**
 * Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
 * а в качестве значения класс Pet. Добавьте в отображение разных животных.
 * Создайте метод выводящий на консоль все ключи отображения.
 */
public class Task5 {
    public static void main(String[] args) {
        PetServiceImpl petService = new PetServiceImpl();
        Pet dog = new Dog("Бим");
        petService.registerListGroup(dog);

        Pet cat = new Cat("Мурзик");
        petService.registerListGroup(cat);

        Pet parrot = new Parrot("Кеша");
        petService.registerListGroup(parrot);

        petService.printListPet();
    }
}
