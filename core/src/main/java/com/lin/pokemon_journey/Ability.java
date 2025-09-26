package com.lin.pokemon_journey;

public class Ability {
    String name;
    String type;
    String category; // Physical, Special, Status
    int power;
    int accuracy;
    public Ability(String name, String type, String category, int power, int accuracy) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
    }
}
