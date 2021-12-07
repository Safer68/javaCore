package Lesson8;


import java.util.Scanner;

public class Task25Bancomat {
    private static final int DENOMINATION_BILLS_20 = 20;
    private static final int DENOMINATION_BILLS_50 = 50;
    private static final int DENOMINATION_BILLS_100 = 100;

    private int quantityBanknote20;
    private int quantityBanknote50;
    private int quantityBanknote100;
    private int balance;

    public Task25Bancomat(int quantityBanknote20, int quantityBanknote50, int quantityBanknote100) {
        this.quantityBanknote20 = quantityBanknote20;
        this.quantityBanknote50 = quantityBanknote50;
        this.quantityBanknote100 = quantityBanknote100;
        this.balance = quantityBanknote20 * DENOMINATION_BILLS_20 + quantityBanknote50 * DENOMINATION_BILLS_50 + quantityBanknote100 * DENOMINATION_BILLS_100;
    }

    public int getQuantityBanknote20() {
        return quantityBanknote20;
    }

    public void setQuantityBanknote20(int quantityBanknote20) {
        balance += quantityBanknote20 * DENOMINATION_BILLS_20;
        this.quantityBanknote20 += quantityBanknote20;
    }

    public int getQuantityBanknote50() {
        return quantityBanknote50;
    }

    public void setQuantityBanknote50(int quantityBanknote50) {
        balance += quantityBanknote50 * DENOMINATION_BILLS_50;
        this.quantityBanknote50 += quantityBanknote50;
    }

    public int getQuantityBanknote100() {
        return quantityBanknote100;
    }

    public void setQuantityBanknote100(int quantityBanknote100) {
        balance += quantityBanknote100 * DENOMINATION_BILLS_100;
        this.quantityBanknote100 += quantityBanknote100;
    }

    public boolean getMoney() {
        Scanner in = new Scanner(System.in);
        int writeOffAmount;
        if (in.hasNext()) {
            writeOffAmount = in.nextInt();
            if (writeOffAmount < balance) {
                return writeOffBalance(writeOffAmount);
            } else {
                System.out.println("Недостаточно средств!");
                return false;
            }
        }
        return false;
    }

    private boolean writeOffBalance(int writeOffAmount) {
        int var100 = quantityBanknote100;
        int var50 = quantityBanknote50;
        int var20 = quantityBanknote20;
        int varSum = writeOffAmount;

        while (varSum >= DENOMINATION_BILLS_100 && var100 != 0) {
            varSum -= DENOMINATION_BILLS_100;
            var100--;
        }

        if (varSum % DENOMINATION_BILLS_50 == 0 || (varSum % DENOMINATION_BILLS_50) % DENOMINATION_BILLS_20 == 0) {
            while (varSum >= DENOMINATION_BILLS_50 && var50 != 0) {
                varSum -= DENOMINATION_BILLS_50;
                var50--;
            }
        }

        while (varSum >= DENOMINATION_BILLS_20 && var20 != 0) {
            varSum -= DENOMINATION_BILLS_20;
            var20--;
        }

        if (varSum == 0) {
            if (var100 != quantityBanknote100) {
                System.out.println("Выдано купюр номиналом 100: " + (quantityBanknote100 - var100) + "шт.");
                quantityBanknote100 -= quantityBanknote100 - var100;
            }
            if (var50 != quantityBanknote50) {
                System.out.println("Выдано купюр номиналом 50: " + (quantityBanknote50 - var50) + "шт.");
                quantityBanknote50 -= quantityBanknote50 - var50;
            }
            if (var20 != quantityBanknote20) {
                System.out.println("Выдано купюр номиналом 20: " + (quantityBanknote20 - var20) + "шт.");
                quantityBanknote20 = quantityBanknote20 - (quantityBanknote20 - var20);
            }
            balance = balance - writeOffAmount;
            return true;
        } else {
            System.out.println("Нет купюр нужного номинала!");
            return false;
        }
    }

    public static void main(String[] args) {
        Task25Bancomat task25Bancomat = new Task25Bancomat(45, 0, 46);
        System.out.println(task25Bancomat.getMoney());
        task25Bancomat.setQuantityBanknote50(5);
        System.out.println(task25Bancomat.getMoney());
        System.out.println(task25Bancomat.getMoney());
        System.out.println(task25Bancomat.getMoney());
    }
}
