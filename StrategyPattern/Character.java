package StrategyPattern;

public class Character {
    private StrategyOption type;

    public Character(StrategyOption type){
        this.type = type;
    }

    public void attack(){
        type.UseAttack();
    }

    public void defend(){
        type.UseDefense();
    }
}
