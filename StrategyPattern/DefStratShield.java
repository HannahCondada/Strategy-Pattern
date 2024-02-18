package StrategyPattern;

public class DefStratShield implements DefenseStrategy{
    @Override
    public void defend(){
        System.out.println("using a shield to defend!");
    }
}
