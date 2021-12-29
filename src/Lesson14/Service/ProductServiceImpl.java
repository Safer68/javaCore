package Lesson14.Service;

import Lesson14.Bean.Product;

import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private final Map<String, Product> map;

    public ProductServiceImpl(Map map) {
        this.map = map;
    }

    @Override
    public void createProduct(String name, int size, int priceProduct) {

        new Product(name, size, priceProduct).registerProduct(map);

    }

    @Override
    public void entrySet() {
        for (String e : map.keySet()) {
            System.out.println("key: " + e + " values: " + map.get(e));
        }

    }

    @Override
    public void keySet() {
        for (String e : map.keySet()) {
            System.out.println("key: " + e);
        }
    }

    @Override
    public void values() {
        for (String e : map.keySet()) {
            System.out.println("----------------------");
            System.out.println("name: " + map.get(e).getName());
            System.out.println("Size: " + map.get(e).getSize());
            System.out.println("PriceProduct: " + map.get(e).getPriceProduct());
            System.out.println("----------------------");
        }
    }

}
