package Lesson16.Bean;

public class HeavyBox extends Lesson14.Bean.HeavyBox implements Comparable<HeavyBox> {
    public HeavyBox(double size, double weight) {
        super(size, weight);
    }

    public int compareTo(HeavyBox o) {
        if (this.getWeight() > o.getWeight()) {
            return -1;
        } else if (super.getWeight() == o.getWeight()) {
            if (this.getSize() < o.getSize()) {
                return 1;
            } else {
                return this.getSize() > o.getSize() ? -1 : 0;
            }
        } else {
            return 1;
        }
    }
}