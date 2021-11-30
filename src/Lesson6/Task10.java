package Lesson6;

public class Task10 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public Task10(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean printValue() {
        return (a + c < f && b + d < e || a + c < e && b + d < f) ? true : false;
    }
}
