package Lesson3;

public class TypeLong {
    private long a;
    final public static long longMax = 9223372036854775807L;
    final public static long longMin = -9223372036854775808L;

    public TypeLong(long a) {
        this.a = a;
    }

    public void addОne() {
        this.a++;
        System.out.println("Переменная \"long\" увеличилась на 1 ");
    }

    public void removeOne() {
        this.a--;
        System.out.println("Переменная \"long\" уменьшилась на 1 ");
    }

    public long getA() {
        return a;
    }

}