package StrategyPattern;

public class GameApp {
    public static void main (String[] args){
        Character Knight = new Character(new Knight());
        Character Wizard = new Character(new Wizard());
        Character Archer = new Character(new Archer());

        System.out.println();
        Knight.attack();
        System.out.println();
        Knight.defend();
        System.out.println();

        Wizard.attack();
        System.out.println();
        Wizard.defend();
        System.out.println();

        Archer.attack();
        System.out.println();
        Archer.defend();
        System.out.println();
    }
}
