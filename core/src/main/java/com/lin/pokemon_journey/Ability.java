package com.lin.pokemon_journey;

public class Ability {
    String name;
    String type;
    String category; // Physical, Special, Status
    int power;
    int accuracy;
    int maxPP;
    int currentPP;
    String description;
    String subtitle;
    public Ability(String name, String type, String category, int power, int accuracy, int maxPP) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.maxPP = maxPP;
        this.currentPP = maxPP;
    }
    public void useAbility() {
        if (currentPP > 0) {
            currentPP--;
        } else {
            subtitle = "";
        }
    }
}
