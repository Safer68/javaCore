package Lesson16;

import Lesson14.Service.ProductService;
import Lesson14.Service.ProductServiceImpl;
import java.util.HashMap;

/**
 * Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Product с произвольными полями).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен продуктов - keySet().
 * Перебрать и распечатать значения продуктов - values().
 * Для каждого перебора создать свой метод.
 */
public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl(new HashMap<>());
        productService.createProduct("Барни", 89, 145);
        productService.createProduct("Тэд", 63, 149);
        productService.createProduct("Бамси", 96, 175);
        productService.entrySet();
        productService.keySet();
        productService.values();
    }
}
