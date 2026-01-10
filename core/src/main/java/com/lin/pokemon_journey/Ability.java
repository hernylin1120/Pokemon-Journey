package com.lin.pokemon_journey;

import java.util.function.Consumer;

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
    int priority = 0;
    private Consumer<Pokemon> userEffect = null;
    private Consumer<Pokemon> targetEffect = null;
    public Ability(String name, String type, String category, int power, int accuracy, int maxPP, String description) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.maxPP = maxPP;
        this.currentPP = maxPP;
        this.description = description;
    }
    // choose between activate and useAbility
    public void useAbility() {
        if (currentPP > 0) {
            currentPP--;
        } else {
            subtitle = "There's no PP left for this move";
        }
    }
    //should be better to determine the PP left in battleScreen
}
