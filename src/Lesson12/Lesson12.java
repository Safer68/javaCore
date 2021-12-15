package Lesson12;

public class Lesson12 {
    public static void main(String[] args) {
        Firm firm = new Firm();
        Firm.Internal firm1 = firm.new Internal();
        Firm.SalesDepartment firm2 = new Firm.SalesDepartment();
        System.out.println(firm.getName());
        System.out.println(firm1.getName());
        System.out.println(firm2.getName());

    }
}
