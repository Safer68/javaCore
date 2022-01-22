package Lesson16;

import Lesson16.Bean.Product;

import java.util.Comparator;

public class SortProduct implements Comparator<Product> {
    private final TypeSort typeSort;
    private final int revers;

    public SortProduct(TypeSort typeSort, int revers) {
        this.typeSort = typeSort;
        this.revers = revers;
    }

    public int compare(Product o1, Product o2) {
        switch (typeSort) {
            case NAME:
                return this.revers * o1.getName().compareTo(o2.getName());
            case PRICE:
                return this.revers * this.sortPrice((int) (o1.getPrice() * 100.0D), (int) (o2.getPrice() * 100.0D));
            case RATING:
                return this.revers * this.sortPrice(o1.getRating(), o2.getRating());
            default:
                return 0;
        }
    }

    private int sortPrice(int o1, int o2) {
        return Integer.compare(o1, o2);
    }
}
