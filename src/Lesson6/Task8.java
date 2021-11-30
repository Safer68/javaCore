package Lesson6;

public class Task8 {
    private int sumMoney;

    public Task8(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public void printValue() {

        if (sumMoney % 100 > 20) {
            if (sumMoney % 10 == 1) {
                System.out.println(sumMoney + " Рубль");
            } else if (sumMoney % 10 > 1 && sumMoney % 10 <= 4) {
                System.out.println(sumMoney + " Рубля");
            } else {
                System.out.println(sumMoney + " Рублей");
            }

        } else {
            if (sumMoney % 20 == 1) {
                System.out.println(sumMoney + " Рубль");
            } else if (sumMoney % 20 > 1 && sumMoney % 20 <= 4) {
                System.out.println(sumMoney + " Рублей");
            } else {
                System.out.println(sumMoney + " Рублей");
            }

        }
    }
}
