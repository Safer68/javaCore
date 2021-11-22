package Patterns.Strategy;

public class Game {
    public static void main(String[] args) {
        Character playerArthur = new King("Arthur", new SwordBehavior());
        Character playerKentyKer = new Queen("KentyKer",new KnifeBehavior());
        Character playerAlyosha = new Knight("Alyosha",new BowAndArrowBehavior());
        Character playerJenga = new Troll("Jenga", new AxeBehavior());
        playerArthur.setOpponent(playerKentyKer);
        System.out.println("В бою участвуют: " + King.class.getSimpleName() +" "+ playerArthur.getName() );
        System.out.println("                 " + Queen.class.getSimpleName() +" "+ playerKentyKer.getName());
        System.out.println("                 " + Knight.class.getSimpleName() +" "+ playerAlyosha.getName());
        System.out.println("                 " + Troll.class.getSimpleName() +" "+ playerJenga.getName());
        playerAlyosha.setOpponent(playerJenga);
        playerJenga.setOpponent(playerAlyosha);
        playerArthur.setOpponent(playerKentyKer);
        playerKentyKer.setOpponent(playerArthur);
        System.out.println(playerAlyosha.getName());
        playerAlyosha.fight();
        System.out.println("Игрока:" + playerAlyosha.getOpponent().getName());
        System.out.println(playerJenga.getName());
        playerJenga.fight();
        System.out.println("Игрока:" + playerJenga.getOpponent().getName());
        System.out.println(playerArthur.getName());
        playerArthur.fight();
        System.out.println("Игрока:" + playerArthur.getOpponent().getName());
        System.out.println(playerAlyosha.getName());
        playerKentyKer.fight();
        System.out.println("Игрока:" + playerKentyKer.getOpponent().getName());
        playerAlyosha.setWeapon(new SwordBehavior());
        playerAlyosha.setOpponent(playerArthur);
        playerArthur.setWeapon(new AxeBehavior());
        playerArthur.setOpponent(playerAlyosha);
        System.out.println(playerArthur.getName());
        playerArthur.fight();
        System.out.println("Игрока:" + playerArthur.getOpponent().getName());
        System.out.println(playerAlyosha.getName());
        playerAlyosha.fight();
        System.out.println("Игрока:" + playerAlyosha.getOpponent().getName());
    }
}
