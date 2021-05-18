package com.emirozturk;

public class Main {
    public static void showInfo(Unit... unitList){
        for(var unit:unitList){
            System.out.println(unit);
        }
    }
    public static void main(String[] args) {
        var player = new Player("Player");
        var enemy = new Enemy();
        var boss = new Boss();
        showInfo(player,enemy,boss);
        System.out.println(player.Attack(enemy));
        showInfo(player,enemy,boss);
    }
}
