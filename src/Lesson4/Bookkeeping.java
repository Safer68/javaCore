package Lesson4;

public class Bookkeeping {

    public static void balanceCompany(LegalEntity legalEntity) {

        System.out.println(legalEntity.getProceeds());
        System.out.println(legalEntity.tax());
        System.out.println(legalEntity.profit());
    }

    public static void main(String[] args) {
        LegalEntity legalEntity = new LegalEntity(20);
        legalEntity.setProceeds(200);
        Ojsc ojsc = new Ojsc(20,5);
        ojsc.setProceeds(300);
        Bookkeeping.balanceCompany(ojsc);
        Bookkeeping.balanceCompany(legalEntity);

    }
}

