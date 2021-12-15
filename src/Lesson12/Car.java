package Lesson12;

public class Car <T extends Engine>{
    private T engine;

    public T getEngine() {
        return engine;
    }

    public void setEngine(T engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car <Diesel> car = new Car();
        car.setEngine(new Diesel());
        System.out.println(car.getEngine().getType());
        Car <Electrical> car1 = new Car();
        car1.setEngine(new Electrical());
        System.out.println(car1.getEngine().getType());
        Car <Gas> car2 = new Car();
        car2.setEngine(new Gas());
        System.out.println(car2.getEngine().getType());
    }
}
