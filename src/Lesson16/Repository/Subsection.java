package Lesson16.Repository;

import Lesson16.Bean.Product;

import java.util.ArrayList;
import java.util.List;

public final class Subsection {
    private final String name;
    private final List<Product> product = new ArrayList<>();

    public Subsection(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public List<Product> getProduct() {
        return this.product;
    }

    public void registerProduct(Product product) {
        this.product.add(product);
    }

    public Product searchProduct(String name) {
        for (Product e : product) {
            if (e.getName() == name) {
                return e;
            }
        }
        return null;
    }

}
