package Lesson14;

import Lesson14.Service.ProductService;
import Lesson14.Service.ProductServiceImpl;

import java.util.HashMap;

/**
 * Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки
 * (класс Product, содержащий размер игрушки и цену).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 */
public class Task3 {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new HashMap());
        productService.createProduct("Райдер", 78, 145);
        productService.createProduct("Мазик", 77, 149);
        productService.createProduct("Вспыш", 77, 149);
        productService.entrySet();
        productService.keySet();
        productService.values();


    }

}
