package Lesson20;

/**
 * Создать программу, которая реализует deadlock между тремя потоками.
 */
public class Task56{

    public static void main(String[] args) {

        MyDeadlock myDeadlock = new MyDeadlock();
        MyDeadlock myDeadlock1 = new MyDeadlock();
        MyDeadlock myDeadlock2 = new MyDeadlock();

        new Thread(() -> myDeadlock.acceptThread(myDeadlock1)).start();
        new Thread(() -> myDeadlock1.acceptThread(myDeadlock2)).start();
        new Thread(() -> myDeadlock2.acceptThread(myDeadlock)).start();

    }

}

