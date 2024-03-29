package Lesson4;

public class Ojsc extends LegalEntity {
    private int roadTax;

    public Ojsc(int taxPercentage, int roadTax) {
        super(taxPercentage);
        this.roadTax = roadTax;
    }

    @Override
    public double profit() {
        return super.profit() - ((double)getProceeds() / 100) * roadTax;
    }

    @Override
    public double tax() {
        return super.tax() + ((double) getProceeds() / 100) * roadTax;
    }

}
