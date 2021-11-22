package Patterns.Strategy;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Удар мечом!");
    }
}
