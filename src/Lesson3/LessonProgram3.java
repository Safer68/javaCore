package Lesson3;

public class LessonProgram3 {

    public static void main(String[] args) {
        TypeByte ObjectByteMax = new TypeByte(TypeByte.BYTE_MAX);
        TypeByte ObjectByteMin = new TypeByte(TypeByte.BYTE_MIN);
        TypeShort ObjectShortMax = new TypeShort(TypeShort.SHORT_MAX);
        TypeShort ObjectShortMin = new TypeShort(TypeShort.SHORT_MIN);
        TypeInt ObjectIntMax = new TypeInt(TypeInt.INT_MAX);
        TypeInt ObjectIntMin = new TypeInt(TypeInt.INT_MIN);
        TypeLong ObjectLongMax = new TypeLong(TypeLong.LONG_MAX);
        TypeLong ObjectLongMin = new TypeLong(TypeLong.LONG_MIN);
        System.out.println("Переменная \"a\" ObjectByteMax=  " + ObjectByteMax.getA());
        System.out.println("Переменная \"a\" ObjectByteMin= " + ObjectByteMin.getA());
        System.out.println("Переменная \"a\" ObjectShortMax= " + ObjectShortMax.getA());
        System.out.println("Переменная \"a\" ObjectShortMin= " + ObjectShortMin.getA());
        System.out.println("Переменная \"a\" ObjectIntMax= " + ObjectIntMax.getA());
        System.out.println("Переменная \"a\" ObjectIntMin= " + ObjectIntMin.getA());
        System.out.println("Переменная \"a\" ObjectLongMax= " + ObjectLongMax.getA());
        System.out.println("Переменная \"a\" ObjectLongMin= " + ObjectLongMin.getA());
        ObjectByteMax.addOne();
        ObjectShortMax.addOne();
        ObjectIntMax.addOne();
        ObjectLongMax.addOne();
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
