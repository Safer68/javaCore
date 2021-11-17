package Lesson4;

public class Ojsc extends LegalEntity {
    private int roadTax;

    public Ojsc(int taxPercentage, int roadTax) {
        super(taxPercentage);
        this.roadTax = roadTax;
    }

    @Override
    public double profit() {
        double profit = super.profit() - ((double)getProceeds() / 100) * roadTax;
        return profit;
    }

    @Override
    public double tax() {
        double tax = super.tax() + ((double) getProceeds() / 100) * roadTax;
        return tax;
    }

}
