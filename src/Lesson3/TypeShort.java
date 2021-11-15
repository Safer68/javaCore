package Lesson3;

public class TypeShort {
    private short a;
    public final static short SHORT_MAX = 32767;
    public final static short SHORT_MIN = -32768;

    public TypeShort(short a) {
        this.a = a;
    }

    public void addOne() {
        this.a++;
    }

    public void removeOne() {
        this.a--;
    }

    public short getA() {
        return a;
    }

}