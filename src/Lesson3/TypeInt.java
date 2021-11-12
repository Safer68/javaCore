package Lesson3;

public class TypeInt {
    private int a;
    final public static int intMax = 2147483647;
    final public static int intMin = -2147483648;

    public TypeInt(int a) {
        this.a = a;
    }

    public void addОne() {
        this.a++;
        System.out.println("Переменная \"int\" увеличилась на 1 ");
    }

    public void removeOne() {
        this.a--;
        System.out.println("Переменная \"int\" уменьшилась на 1 ");
    }

    public int getA() {
        return a;
    }

}
