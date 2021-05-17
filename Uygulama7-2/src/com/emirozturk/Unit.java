package com.emirozturk;

public class Unit {
    protected String Name;
    protected int HP;
    protected int Mana;

    public Unit(String Name, int HP, int Mana) {
        this.Name = Name;
        this.HP = HP;
        this.Mana = Mana;
    }

    public String Attack(Unit otherUnit){
        otherUnit.HP -=10;
        return "%s inflicted 10 damage to %s".formatted(Name,otherUnit.Name);
    }

    @Override
    public String toString() {
        if(HP>0)
            return "%s : { %d - %d }".formatted(Name, HP, Mana);
        else
            return "%s fainted.".formatted(Name);
    }
}
