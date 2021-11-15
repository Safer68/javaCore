package Lesson3;

public class TypeLong {
    private long a;
    public final static long LONG_MAX = 9223372036854775807L;
    public final static long LONG_MIN = -9223372036854775808L;

    public TypeLong(long a) {
        this.a = a;
    }

    public void addOne() {
        this.a++;
    }

    public void removeOne() {
        this.a--;
    }

    public long getA() {
        return a;
    }

}