package Lesson14.Bean;

import java.util.Objects;

public class HeavyBox {
    private final double size;
    private double weight;

    public HeavyBox(double size, double weight) {
        this.size = size;
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return Double.compare(heavyBox.size, size) == 0 && Double.compare(heavyBox.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, weight);
    }
}
