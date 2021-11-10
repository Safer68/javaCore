package Lesson2;

public class Memory {

    byte byteMax = 127;
    byte byteMin = -128;
    short shortMax = 32767;
    short shortMin = -32768;
    int intMax = 2147483647;
    int intMin = -2147483648;
    long longMax = 9223372036854775807L;
    long longMin = -9223372036854775808L;
    float floatMax = 3.4028235E38F;
    float floatMin = 1.4E-45F;
    double doubleMax = 1.7976931348623157E308D;
    double doubleMin = 4.9E-324D;

    public void addОne() {
        this.byteMax++;
        this.shortMax++;
        this.intMax++;
        this.longMax++;
        System.out.println("Переменные: byteMax; shortMax; intMax; longMax, увеличились на 1 ");
    }

    public void removeOne() {
        this.byteMin--;
        this.shortMin--;
        this.intMin--;
        this.longMin--;
        System.out.println("Переменные: byteMin; shortMin; intMin; longMin, уменьшились на 1 ");
    }

    public void printVariable() {
        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);
        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);
        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);
        System.out.println("longMax = " + floatMax);
        System.out.println("longMin = " + floatMin);
        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);
        System.out.println("doubleMax = " + doubleMax);
        System.out.println("doubleMin = " + doubleMin);
    }

    public static void main(String[] args) {
        Memory myClass = new Memory();
        myClass.printVariable();
        myClass.addОne();
        System.out.println("byteMax = " + myClass.byteMax);
        System.out.println("shortMax = " + myClass.shortMax);
        System.out.println("intMax = " + myClass.intMax);
        System.out.println("longMax = " + myClass.longMax);
        myClass.removeOne();
        System.out.println("byteMin = " + myClass.byteMin);
        System.out.println("shortMin = " + myClass.shortMin);
        System.out.println("intMin = " + myClass.intMin);
        System.out.println("longMin = " + myClass.longMin);
    }
}
