package Lesson3;

public class LessonProgram3 {

    public static void main(String[] args) {
        TypeByte ObjectByteMax = new TypeByte(TypeByte.byteMax);
        TypeByte ObjectByteMin = new TypeByte(TypeByte.byteMin);
        TypeShort ObjectShortMax = new TypeShort(TypeShort.shortMax);
        TypeShort ObjectShortMin = new TypeShort(TypeShort.shortMin);
        TypeInt ObjectIntMax = new TypeInt(TypeInt.intMax);
        TypeInt ObjectIntMin = new TypeInt(TypeInt.intMin);
        TypeLong ObjectLongMax = new TypeLong(TypeLong.longMax);
        TypeLong ObjectLongMin = new TypeLong(TypeLong.longMin);
        System.out.println("Переменная \"a\" ObjectByteMax=  " + ObjectByteMax.getA());
        System.out.println("Переменная \"a\" ObjectByteMin= " + ObjectByteMin.getA());
        System.out.println("Переменная \"a\" ObjectShortMax= " + ObjectShortMax.getA());
        System.out.println("Переменная \"a\" ObjectShortMin= " + ObjectShortMin.getA());
        System.out.println("Переменная \"a\" ObjectIntMax= " + ObjectIntMax.getA());
        System.out.println("Переменная \"a\" ObjectIntMin= " + ObjectIntMin.getA());
        System.out.println("Переменная \"a\" ObjectLongMax= " + ObjectLongMax.getA());
        System.out.println("Переменная \"a\" ObjectLongMin= " + ObjectLongMin.getA());
        ObjectByteMax.addОne();
        ObjectShortMax.addОne();
        ObjectIntMax.addОne();
        ObjectLongMax.addОne();
        ObjectByteMin.removeOne();
        ObjectShortMin.removeOne();
        ObjectIntMin.removeOne();
        ObjectLongMin.removeOne();
        System.out.println("Переменная \"a\" ObjectByteMax=  " + ObjectByteMax.getA());
        System.out.println("Переменная \"a\" ObjectByteMin= " + ObjectByteMin.getA());
        System.out.println("Переменная \"a\" ObjectShortMax= " + ObjectShortMax.getA());
        System.out.println("Переменная \"a\" ObjectShortMin= " + ObjectShortMin.getA());
        System.out.println("Переменная \"a\" ObjectIntMax= " + ObjectIntMax.getA());
        System.out.println("Переменная \"a\" ObjectIntMin= " + ObjectIntMin.getA());
        System.out.println("Переменная \"a\" ObjectLongMax= " + ObjectLongMax.getA());
        System.out.println("Переменная \"a\" ObjectLongMin= " + ObjectLongMin.getA());
    }
}
