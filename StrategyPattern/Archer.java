package StrategyPattern;

public class Archer implements StrategyOption {
    AtkStratShootArrow atkStratShootArrow = new AtkStratShootArrow();
    DefStratShield defStratShield = new DefStratShield();


    public void UseAttack(){
        System.out.print("Archer: ");
        atkStratShootArrow.attack();
    }

    public void UseDefense(){
        System.out.print("Archer: ");
        defStratShield.defend();
    }
}
