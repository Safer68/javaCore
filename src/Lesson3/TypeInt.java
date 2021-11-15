package Lesson3;

public class TypeInt {
    private int a;
    public final static int INT_MAX = 2147483647;
    public final static int INT_MIN = -2147483648;

    public TypeInt(int a) {
        this.a = a;
    }

    public void addOne() {
        this.a++;
    }

    public void removeOne() {
        this.a--;
    }

    public int getA() {
        return a;
    }

}
