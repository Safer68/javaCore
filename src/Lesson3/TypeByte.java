package Lesson3;

public class TypeByte {
    private byte a;
    public final static byte BYTE_MAX = 127;
    public final static byte BYTE_MIN = -128;

    public TypeByte(byte a) {
        this.a = a;
    }

    public void addOne() {
        this.a++;
     }

    public void removeOne() {
        this.a--;
    }

    public byte getA() {
        return a;
    }

}
