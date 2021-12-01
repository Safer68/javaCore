package Lesson8;


import java.util.Scanner;

public class Task25Bancomat {

    private int naminal20;
    private int naminal50;
    private int naminal100;
    private int balance;

    public Task25Bancomat(int naminal20, int naminal50, int naminal100) {
        this.naminal20 = naminal20;
        this.naminal50 = naminal50;
        this.naminal100 = naminal100;
        this.balance = naminal20 * 20 + naminal50 * 50 + naminal100 * 100;
    }

    public int getNaminal20() {
        return naminal20;
    }

    public void setNaminal20(int naminal20) {
        this.naminal20 = naminal20;
    }

    public int getNaminal50() {
        return naminal50;
    }

    public void setNaminal50(int naminal50) {
        this.naminal50 = naminal50;
    }

    public int getNaminal100() {
        return naminal100;
    }

    public void setNaminal100(int naminal100) {
        this.naminal100 = naminal100;
    }

    private int minNaminal() {
        if (naminal20 > 0) {
            return 20;
        } else if (naminal50 > 0) {
            return 50;
        } else {
            return 100;
        }
    }

    private boolean writeOffBalance(int summ) {
        int n100 = naminal100;
        int n50 = naminal50;
        int n20 = naminal20;
        int summSpis = summ;
        if (summSpis >= 100 && n100 != 0) {
            for (int i = n100; 0 < i; i--) {
                if (summSpis >= 100) {
                    summSpis = summSpis - 100;
                    n100--;
                } else break;
            }
        }
        if (summSpis >= 50 && n50 != 0) {
            for (int i = n50; 0 < i; i--) {
                if (summSpis >= 50) {
                    summSpis = summSpis - 50;
                    n50--;
                } else break;
            }
        }
        if (summSpis >= 20 && n20 != 0) {
            for (int i = n20; 0 < i; i--) {
                if (summSpis >= 20) {
                    summSpis = summSpis - 20;
                    n20--;
                } else break;
            }

        }
        if (summSpis == 0) {
            System.out.println("Списано 100 купюр: " + (naminal100 - n100) + "шт.");
            naminal100 = naminal100 - n100;
            System.out.println("Списано 50 купюр: " + (naminal50 - n50) + "шт.");
            naminal100 = naminal50 - n50;
            System.out.println("Списано 20 купюр: " + (naminal20 - n20) + "шт.");
            naminal100 = naminal50 - n20;
            balance = balance-summ;
            return true;
        }else return false;
    }


    public boolean getMoney() {
        Scanner in = new Scanner(System.in);
        int summ = in.nextInt();
        if (summ < balance && summ % minNaminal() == 0) {
            return writeOffBalance(summ);

        } else if (summ > balance && summ % minNaminal() != 0) {
            System.out.println("Нет купюр нужного номинала!");
            return false;
        } else {
            System.out.println("Недостаточно средств!");
            return false;
        }
    }

    public static void main(String[] args) {
        Task25Bancomat task25Bancomat = new Task25Bancomat(45,53,46);
        System.out.println(task25Bancomat.getMoney());
        System.out.println(task25Bancomat.getMoney());
        System.out.println(task25Bancomat.getMoney());
        System.out.println(task25Bancomat.getMoney());

    }
}
