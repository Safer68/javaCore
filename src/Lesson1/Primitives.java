package Lesson1;

public class Primitives {
    public static void main(String[] args) {
        byte byteValue = 0b01111111;//8bit
        short shortValue = 0b01111111_11111111;//16bt
        int intValue = 0b01111111_11111111_11111111_11111111;//32bit
        long longValue = 0b01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111L;//64bit
        char chartValue = 0b11111111_11111111;//16bt
        System.out.println("byteValue: " + ~byteValue + " to " + byteValue);
        System.out.println("shortValue: " + ~shortValue + " to " + shortValue);
        System.out.println("intValue: " + ~intValue + " to " + intValue);
        System.out.println("longValue: " + ~longValue + " to " + longValue);
        System.out.println("chartValue: 0 to " + (int) chartValue);

//        float floatValue = 0x0.000002P-126f;//32bit
//        double doubleValue = 0b1_00000000000_10000000000000000;//32bit
//        System.out.println("floatValue: " + floatValue);
//        System.out.println("MIN_VALUE: " + Float.MIN_VALUE);
//        System.out.println("MAX_VALUE: " + Float.MAX_VALUE);
//
//        System.out.println("0 to " + (int) chartValue);
//        System.out.println(Float.to;
    }
}
