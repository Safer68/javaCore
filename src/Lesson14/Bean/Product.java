package Lesson14.Bean;

import com.sun.istack.internal.NotNull;

import java.util.Map;
import java.util.Objects;

public class Product {
    private final String name;
    private final int size;
    private int priceProduct;

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public Product(String name, int size, int priceProduct) {
        this.size = size;
        this.priceProduct = priceProduct;
        this.name = name;
    }
    @NotNull
    public void registerProduct(Map map) {
        map.put(name, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return size == product.size && priceProduct == product.priceProduct && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, priceProduct);
    }
}