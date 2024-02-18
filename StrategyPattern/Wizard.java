package StrategyPattern;

public class Wizard implements StrategyOption{
    AtkStratCastSpell atkStratCastSpell = new AtkStratCastSpell();
    DefStratCreateMagic defStratCreateMagic = new DefStratCreateMagic();
    public void UseAttack(){
        System.out.print("Wizard: ");
        atkStratCastSpell.attack();
    }
    public void UseDefense(){
        System.out.print("Wizard: ");
        defStratCreateMagic.defend();
    }
}
