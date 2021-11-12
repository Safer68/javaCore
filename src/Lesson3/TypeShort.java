package Lesson3;

public class TypeShort {
    private short a;
    final public static short shortMax = 32767;
    final public static short shortMin = -32768;

    public TypeShort(short a) {
        this.a = a;
    }

    public void addОne() {
        this.a++;
        System.out.println("Переменная \"short\" увеличилась на 1 ");
    }

    public void removeOne() {
        this.a--;
        System.out.println("Переменная \"short\" уменьшилась на 1 ");
    }

    public short getA() {
        return a;
    }

}