package Lesson20;

public class MyDeadlock {

    public synchronized void acceptThread(MyDeadlock thread) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.printThread();
    }

    public synchronized void printThread() {

        System.out.println(Thread.currentThread().getName());

    }

}
