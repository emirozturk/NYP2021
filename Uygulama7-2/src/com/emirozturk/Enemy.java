package com.emirozturk;

public class Enemy extends Unit {
    public Enemy(String Name,int HP,int Mana) {
        super(Name, HP, Mana);
    }
    public Enemy(){
        super("Minion",10,10);
    }
}
