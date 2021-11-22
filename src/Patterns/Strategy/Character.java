package Patterns.Strategy;

public abstract class Character {
    private final String NAME;
    private WeaponBehavior weapon;
    private Character opponent;

    public Character(String name, WeaponBehavior weapon) {
        this.NAME = name;
        this.weapon = weapon;
    }

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public Character getOpponent() {
        return opponent;
    }

    public void setOpponent(Character opponent) {
        this.opponent = opponent;
    }

    public String getName() {
        return NAME;
    }


}
