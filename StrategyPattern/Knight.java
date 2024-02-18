package StrategyPattern;

public class Knight implements StrategyOption{
    AtkStratSwingSword atkStratSwingSword = new AtkStratSwingSword();
    DefStratShield defStratShield = new DefStratShield();
    DefStratDodge defStratDodge = new DefStratDodge();
    DefStratCreateMagic defStratCreateMagic = new DefStratCreateMagic();

    public void UseAttack(){
        System.out.print("Knight: ");
        atkStratSwingSword.attack();
    }

    public void UseDefense(){
        System.out.print("Knight: ");
        defStratShield.defend();
        System.out.print("Knight: ");
        defStratDodge.defend();
        System.out.print("Knight: ");
        defStratCreateMagic.defend();
    }
}
