package Lesson8;

public class Task24 {
    private int hour;
    private int minute;
    private int second;

    public Task24(int second) {
        this.hour = second / 3600;
        this.minute = ((double) (second / 60) / 60 > 1) ? (second / 60) % 60 : (second / 60) / 60;
        this.second = (second < 60) ? second : (second % 60);
    }

    public Task24(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public int second() {
        int sec = this.second + minute * 60 + hour * 3600;
        return sec;
    }

    public int compareTo(Task24 task24) {
        return second() - task24.second();
    }

    public static void main(String[] args) {
        Task24 task24 = new Task24(45, 15, 36);
        System.out.println(task24.getSecond());
        System.out.println(task24.compareTo(new Task24(task24.second() + 85)));
    }
}
