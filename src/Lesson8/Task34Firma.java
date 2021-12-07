package Lesson8;

abstract class Task34Firma {

    protected abstract void payroll();

public static void pay(Task34Firma task34Firma){
    task34Firma.payroll();
}

    public static void main(String[] args) {
       pay(new Task34Director());
       pay(new Task34ChiefEngineer());
       pay(new Task34Engineer());
       }


}
