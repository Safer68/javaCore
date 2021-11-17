package Lesson4;

public class Bookkeeping {

    public void balanceCompany(LegalEntity legalEntity) {

        System.out.println(legalEntity.getProceeds());
        System.out.println(legalEntity.tax());
        System.out.println(legalEntity.profit());
    }

    public static void main(String[] args) {
        LegalEntity legalEntity = new LegalEntity(20);
        legalEntity.setProceeds(200);
        Ojsc ojsc = new Ojsc(20,5);
        ojsc.setProceeds(300);
        System.out.println(legalEntity.getProceeds());
        System.out.println(legalEntity.profit());
        System.out.println(ojsc.getProceeds());
        System.out.println(ojsc.profit());
//        Bookkeeping bookkeeping = new Bookkeeping();
//        bookkeeping.balanceCompany(ojsc);

    }
}

