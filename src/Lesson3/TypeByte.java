package Lesson3;

public class TypeByte {
    private byte a;
    final public static byte byteMax = 127;
    final public static byte byteMin = -128;

    public TypeByte(byte a) {
        this.a = a;
    }

    public void addОne() {
        this.a++;
        System.out.println("Переменная \"byte\" увеличилась на 1 ");
    }

    public void removeOne() {
        this.a--;
        System.out.println("Переменная \"byte\" уменьшилась на 1 ");
    }

    public byte getA() {
        return a;
    }

}
