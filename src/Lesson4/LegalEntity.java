package Lesson4;

public class LegalEntity {

    private int taxPercentage;
    private int proceeds;

    public LegalEntity(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public int getProceeds() {
        return proceeds;
    }

    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }

    public double profit() {
        double profit = proceeds - ((double)proceeds / 100) * taxPercentage;
        return profit;
    }

    public double tax() {
        double tax = ((double)proceeds / 100) * taxPercentage;
        return tax;
    }

}
