package Lesson1;

public class Primitives {
    public static void main(String[] args) {
        byte byteValue = 0b01111111;//8bit
        short shortValue = 0b01111111_11111111;//16bt
        int intValue = 0b01111111_11111111_11111111_11111111;//32bit
        long longValue = 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L;//64bit
        char chartValue = 0b11111111_11111111;//16bit
        System.out.println("byteValue: " + ~byteValue + " to " + byteValue);
        System.out.println("shortValue: " + ~shortValue + " to " + shortValue);
        System.out.println("intValue: " + ~intValue + " to " + intValue);
        System.out.println("longValue: " + ~longValue + " to " + longValue);
        System.out.println("chartValue: 0 to " + (int) chartValue);

//        float floatValue = 0b0_111111111_1111111111111111111111;//32bit
        System.out.println("floatValue: " + 1.4e-45 + " to " + 3.4028235E38);
//        double doubleValue = 0b0_1111111111111111_11111111111111111111111111111111111111111111111L;//64bit
        System.out.println("doubleValue: " + 4.9E-324 + " to " + 1.7976931348623157E308);
    }
}
